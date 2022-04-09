fun main() {
    val n = readln().toInt()
    var result = 0

    for (i in 1..n) {
        val input = readln().toInt()
        result += input
    }

    println(result)
}