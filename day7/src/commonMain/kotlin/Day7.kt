import kotlin.math.pow

fun main() {
    val lines = getInput().lines()
    val equations = lines.map { parseLine(it) }

    var result1 = 0L
    var result2 = 0L

    for (eq in equations) {
        if (reduce(eq, eq.test, eq.numbers.size - 1, 1)) {
            result1 += eq.test
            result2 += eq.test
        } else if (reduce(eq, eq.test, eq.numbers.size - 1, 2)) {
            result2 += eq.test
        }
    }

    println(result1)
    println(result2)
}

private data class Equation(
    val test: Long,
    val numbers: List<Long>,
    val magnitudes: List<Long>
)

private fun parseLine(line: String): Equation {
    val parts = line.split(": ")
    val testValue = parts[0].toLong()
    val numbers = parts[1].split(" ").map { it.toLong() }
    val magnitudes = numbers.map { num -> 10.0.pow(num.toString().length.toDouble()).toLong() }
    return Equation(test = testValue, numbers = numbers, magnitudes = magnitudes)
}

private fun reduce(eq: Equation, residue: Long, index: Int, part: Int): Boolean {
    if (index == 0) return residue == eq.numbers[0]

    val currentNumber = eq.numbers[index]
    val currentMagnitude = eq.magnitudes[index]

    if (residue > currentNumber && reduce(eq, residue - currentNumber, index - 1, part)) {
        return true
    }

    if (residue % currentNumber == 0L && reduce(eq, residue / currentNumber, index - 1, part)) {
        return true
    }

    if (part == 2) {
        val quotient = residue / currentMagnitude
        val remainder = residue % currentMagnitude
        if (remainder == currentNumber && reduce(eq, quotient, index - 1, part)) {
            return true
        }
    }

    return false
}
