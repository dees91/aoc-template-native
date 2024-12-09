internal fun search1(lines: List<String>): Int {
    val width = lines[0].length
    val height = lines.size

    var count = 0
    for (h in 0..<height) {
        for (w in 0..<width) {
            if (lines[h][w] == 'X') {
                if (s1(lines, h, w)) count++
                if (s2(lines, h, w)) count++
                if (s3(lines, h, w)) count++
                if (s4(lines, h, w)) count++
                if (s5(lines, h, w)) count++
                if (s6(lines, h, w)) count++
                if (s7(lines, h, w)) count++
                if (s8(lines, h, w)) count++
            }
        }
    }

    return count
}

private fun s1(lines: List<String>, h: Int, w: Int): Boolean {
    return lines.getOrNull(h)?.getOrNull(w - 1) == 'M' &&
            lines.getOrNull(h)?.getOrNull(w - 2) == 'A' &&
            lines.getOrNull(h)?.getOrNull(w - 3) == 'S'
}

private fun s2(lines: List<String>, h: Int, w: Int): Boolean {
    return lines.getOrNull(h)?.getOrNull(w + 1) == 'M' &&
            lines.getOrNull(h)?.getOrNull(w + 2) == 'A' &&
            lines.getOrNull(h)?.getOrNull(w + 3) == 'S'
}

private fun s3(lines: List<String>, h: Int, w: Int): Boolean {
    return lines.getOrNull(h - 1)?.getOrNull(w - 1) == 'M' &&
            lines.getOrNull(h - 2)?.getOrNull(w - 2) == 'A' &&
            lines.getOrNull(h - 3)?.getOrNull(w - 3) == 'S'
}

private fun s4(lines: List<String>, h: Int, w: Int): Boolean {
    return lines.getOrNull(h - 1)?.getOrNull(w + 1) == 'M' &&
            lines.getOrNull(h - 2)?.getOrNull(w + 2) == 'A' &&
            lines.getOrNull(h - 3)?.getOrNull(w + 3) == 'S'
}

private fun s5(lines: List<String>, h: Int, w: Int): Boolean {
    return lines.getOrNull(h - 1)?.getOrNull(w) == 'M' &&
            lines.getOrNull(h - 2)?.getOrNull(w) == 'A' &&
            lines.getOrNull(h - 3)?.getOrNull(w) == 'S'
}

private fun s6(lines: List<String>, h: Int, w: Int): Boolean {
    return lines.getOrNull(h + 1)?.getOrNull(w + 1) == 'M' &&
            lines.getOrNull(h + 2)?.getOrNull(w + 2) == 'A' &&
            lines.getOrNull(h + 3)?.getOrNull(w + 3) == 'S'
}

private fun s7(lines: List<String>, h: Int, w: Int): Boolean {
    return lines.getOrNull(h + 1)?.getOrNull(w) == 'M' &&
            lines.getOrNull(h + 2)?.getOrNull(w) == 'A' &&
            lines.getOrNull(h + 3)?.getOrNull(w) == 'S'
}

private fun s8(lines: List<String>, h: Int, w: Int): Boolean {
    return lines.getOrNull(h + 1)?.getOrNull(w - 1) == 'M' &&
            lines.getOrNull(h + 2)?.getOrNull(w - 2) == 'A' &&
            lines.getOrNull(h + 3)?.getOrNull(w - 3) == 'S'
}
