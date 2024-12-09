fun main() {
    val updates = 209
    val pages = 23

    val rule = Array(100) { BooleanArray(100) }
    val page = Array(updates) { IntArray(pages) }
    val pageCount = IntArray(updates)

    val comparator = Comparator<Int> { a, b ->
        when {
            rule[a][b] -> -1
            rule[b][a] -> 1
            else -> 0
        }
    }

    val lines = getInput().lines()
    var i = 0
    for (line in lines) {
        if (line.isBlank()) continue
        if (line[2] == '|') {
            val a = line.take(2).toInt()
            val b = line.substring(3).toInt()
            rule[a][b] = true
        } else {
            val tokens = line.split(',')
            tokens.forEachIndexed { idx, token -> page[i][idx] = token.toInt() }
            pageCount[i++] = tokens.size
        }
    }

    var resultPart1 = 0
    var resultPart2 = 0

    for (x in 0 until updates) {
        var ordered = true
        for (j in 1 until pageCount[x]) {
            if (rule[page[x][j]][page[x][j - 1]]) {
                val subArray = page[x].copyOfRange(0, pageCount[x])
                subArray.sortWith(comparator)
                for (k in subArray.indices) page[x][k] = subArray[k]
                resultPart2 += page[x][pageCount[x] / 2]
                ordered = false
                break
            }
        }
        if (ordered) {
            resultPart1 += page[x][pageCount[x] / 2]
        }
    }

    println(resultPart1)
    println(resultPart2)
}
