private const val BOARD_SIZE = 130
private const val OBSTACLE = 1.toByte()
private const val FREE_SPACE = 0.toByte()

private data class GuardPosition(var line: Int, var column: Int)

private data class GuardState(val position: GuardPosition, val direction: Int)

private object Direction {
    const val UP = 0

    fun turnRight(direction: Int): Int = (direction + 1) % 4
}

private val movementSteps = arrayOf(
    GuardPosition(-1, 0), // UP
    GuardPosition(0, 1),  // RIGHT
    GuardPosition(1, 0),  // DOWN
    GuardPosition(0, -1)  // LEFT
)

private val board = Array(BOARD_SIZE) { ByteArray(BOARD_SIZE) }
private val visitHistory = Array(BOARD_SIZE) { ByteArray(BOARD_SIZE) }

private val traversalPath = mutableListOf<GuardState>()

private fun initializeBoard(startPosition: GuardPosition) {
    getInput().lines().forEachIndexed { lineIndex, line ->
        line.forEachIndexed { columnIndex, char ->
            when (char) {
                '^' -> {
                    startPosition.line = lineIndex
                    startPosition.column = columnIndex
                    board[lineIndex][columnIndex] = FREE_SPACE
                }

                '#' -> {
                    board[lineIndex][columnIndex] = OBSTACLE
                }

                else -> {
                    board[lineIndex][columnIndex] = FREE_SPACE
                }
            }
        }
    }
}

private fun isOnBoard(position: GuardPosition) =
    position.line in 0 until BOARD_SIZE && position.column in 0 until BOARD_SIZE

private fun inspectCell(position: GuardPosition) = board[position.line][position.column]

private fun markCell(position: GuardPosition, value: Byte) {
    board[position.line][position.column] = value
}

private fun moveForward(position: GuardPosition, direction: Int): GuardPosition {
    val step = movementSteps[direction]
    return GuardPosition(position.line + step.line, position.column + step.column)
}

private fun recordHistory(position: GuardPosition, direction: Int) {
    val index = visitHistory[position.line][position.column].toInt()
    visitHistory[position.line][position.column] = (index or (1 shl direction)).toByte()
}

private fun hasVisitedBefore(position: GuardPosition, direction: Int): Boolean {
    return visitHistory[position.line][position.column].toInt() and (1 shl direction) != 0
}

private fun saveStep(position: GuardPosition, direction: Int): Boolean {
    val isNewStep = visitHistory[position.line][position.column] == FREE_SPACE
    traversalPath.add(GuardState(position, direction))
    recordHistory(position, direction)
    return isNewStep
}

private fun walk(boardStart: GuardPosition, initialDirection: Int): Int {
    var visitedCells = 1
    var currentPosition = boardStart
    var currentDirection = initialDirection

    while (true) {
        val nextPosition = moveForward(currentPosition, currentDirection)
        if (!isOnBoard(nextPosition)) break

        if (inspectCell(nextPosition) != OBSTACLE) {
            visitedCells += if (saveStep(currentPosition, currentDirection)) 1 else 0
            currentPosition = nextPosition
        } else {
            currentDirection = Direction.turnRight(currentDirection)
        }
    }
    saveStep(currentPosition, currentDirection)
    return visitedCells
}

private fun detectLoopFrom(index: Int): Boolean {
    visitHistory.forEach { it.fill(FREE_SPACE) }

    var currentPosition = traversalPath[index - 1].position
    var currentDirection = traversalPath[index - 1].direction

    while (true) {
        val nextPosition = moveForward(currentPosition, currentDirection)
        if (!isOnBoard(nextPosition)) return false

        if (inspectCell(nextPosition) != OBSTACLE) {
            if (hasVisitedBefore(currentPosition, currentDirection)) return true
            recordHistory(currentPosition, currentDirection)
            currentPosition = nextPosition
        } else {
            currentDirection = Direction.turnRight(currentDirection)
        }
    }
}

fun main() {
    val startGuardPosition = GuardPosition(0, 0)
    val startDirection = Direction.UP
    initializeBoard(startGuardPosition)

    println(walk(startGuardPosition, startDirection))

    var loopCount = 0
    val distinctPath = traversalPath.distinctBy(GuardState::position)
    for (i in distinctPath.indices) {
        if (i == 0) continue
        markCell(distinctPath[i].position, OBSTACLE)
        if (detectLoopFrom(i)) loopCount++
        markCell(distinctPath[i].position, FREE_SPACE)
    }

    println(loopCount)
}
