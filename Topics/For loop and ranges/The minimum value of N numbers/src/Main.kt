fun main() {
    val n = readln().toInt()
    val first = readln().toInt()
    var min = first

    repeat(n - 1) {
        val num = readln().toInt()

        if (num < min) min = num
    }

    println(min)
}