fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()

    val within = first in second..third
    println(within)
}