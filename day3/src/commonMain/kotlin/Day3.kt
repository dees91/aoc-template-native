@file:OptIn(ExperimentalForeignApi::class)

import kotlinx.cinterop.*
import platform.posix.*

fun main() {
    val input = readInput()
    val parts = input.split(MUL_START)
    println(part1(parts))
    println(part2(parts))
}

fun part1(parts: List<String>): Any {
    var sum = 0L
    for (part in parts) {
        val candidate = part.substringBefore(MUL_END)
        if (!candidate.contains(",")) continue
        val left = candidate.substringBefore(",")
        val right = candidate.substringAfter(",")
        if (left.length !in (1..3)) continue
        if (right.length !in (1..3)) continue
        val a = left.toIntOrNull() ?: continue
        val b = right.toIntOrNull() ?: continue
        sum += a * b
    }

    return sum
}

fun part2(parts: List<String>): Any {
    var sum = 0L
    var enabled = true
    for (part in parts) {
        val previousEnabled = enabled
        val candidate = part.substringBefore(MUL_END)
        val doIndex = part.indexOf(DO)
        val doNotIndex = part.indexOf(DONT)
        var index = -1
        if (doIndex > doNotIndex) {
            enabled = true
            index = doIndex
        } else if (doNotIndex > doIndex) {
            enabled = false
            index = doNotIndex
        }
        if ((part.indexOf(candidate) <= index || !enabled) && !previousEnabled) continue
        if (!candidate.contains(",")) continue
        val left = candidate.substringBefore(",")
        val right = candidate.substringAfter(",")
        if (left.length !in (1..3)) continue
        if (right.length !in (1..3)) continue
        val a = left.toIntOrNull() ?: continue
        val b = right.toIntOrNull() ?: continue
        sum += a * b
    }

    return sum
}

private const val MUL_START = "mul("
private const val MUL_END = ")"
private const val DO = "do()"
private const val DONT = "don't()"

private fun readInput(): String {
    val returnBuffer = StringBuilder()
    var cwd = getcwd(null, 0U)!!.toKString()
    if (!cwd.contains("day3")) {
        cwd += "/day3"
    }
    val resourceDir = "${cwd}/src/commonMain/resources"
    val file = fopen("$resourceDir/Day3.input", "r") ?:
    throw IllegalArgumentException("Cannot open input file Day3.input $cwd")

    try {
        memScoped {
            val readBufferLength = 64 * 1024
            val buffer = allocArray<ByteVar>(readBufferLength)
            var line = fgets(buffer, readBufferLength, file)?.toKString()
            while (line != null) {
                returnBuffer.append(line)
                line = fgets(buffer, readBufferLength, file)?.toKString()
            }
        }
    } finally {
        fclose(file)
    }

    return returnBuffer.toString()
}
