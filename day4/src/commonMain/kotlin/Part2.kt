internal fun search2(lines: List<String>): Int {
    val width = lines[0].length
    val height = lines.size

    var count = 0
    for (w in 1..<width - 1) {
        for (h in 1..<height - 1) {
            if (lines[h][w] == 'A') {
                if (
                    s1(lines, h, w) ||
                    s2(lines, h, w) ||
                    s3(lines, h, w) ||
                    s4(lines, h, w)
                ) count++
            }
        }
    }

    return count
}

//M.S
//.A.
//M.S
private fun s1(
    lines: List<String>,
    h: Int,
    w: Int
): Boolean {
    return lines[h - 1][w - 1] == 'M' &&
            lines[h + 1][w + 1] == 'S' &&
            lines[h - 1][w + 1] == 'S' &&
            lines[h + 1][w - 1] == 'M'
}

//M.M
//.A.
//S.S
private fun s2(
    lines: List<String>,
    h: Int,
    w: Int
): Boolean {
    return lines[h - 1][w - 1] == 'M' &&
            lines[h + 1][w + 1] == 'S' &&
            lines[h - 1][w + 1] == 'M' &&
            lines[h + 1][w - 1] == 'S'
}

//S.M
//.A.
//S.M
private fun s3(
    lines: List<String>,
    h: Int,
    w: Int
): Boolean {
    return lines[h - 1][w - 1] == 'S' &&
            lines[h + 1][w + 1] == 'M' &&
            lines[h - 1][w + 1] == 'M' &&
            lines[h + 1][w - 1] == 'S'
}

//S.S
//.A.
//M.M
private fun s4(
    lines: List<String>,
    h: Int,
    w: Int
): Boolean {
    return lines[h - 1][w - 1] == 'S' &&
            lines[h + 1][w + 1] == 'M' &&
            lines[h - 1][w + 1] == 'S' &&
            lines[h + 1][w - 1] == 'M'
}