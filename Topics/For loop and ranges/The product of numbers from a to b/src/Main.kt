fun main() {
    val n1 = readln().toInt()
    val n2 = readln().toInt()

    var result = 1L

    for (i in n1 until n2) {
        result *= i
    }

    println(result)
}