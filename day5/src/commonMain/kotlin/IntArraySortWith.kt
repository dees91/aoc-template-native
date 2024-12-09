fun IntArray.sortWith(comparator: Comparator<Int>) {
    fun partition(array: IntArray, lo: Int, hi: Int): Int {
        val pivot = array[(lo + hi) / 2]
        var i = lo - 1
        var j = hi + 1
        while (true) {
            do {
                i = i + 1
            } while (comparator.compare(array[i], pivot) < 0)
            do {
                j = j - 1
            } while (comparator.compare(array[j], pivot) > 0)
            if (i >= j) {
                return j
            }
            val tmp = array[j]
            array[j] = array[i]
            array[i] = tmp
        }
    }

    fun quicksort(array: IntArray, lo: Int, hi: Int) {
        if (lo < hi) {
            val p = partition(array, lo, hi)
            quicksort(array, lo, p)
            quicksort(array, p + 1, hi)
        }
    }

    quicksort(this, 0, this.size - 1)
}
