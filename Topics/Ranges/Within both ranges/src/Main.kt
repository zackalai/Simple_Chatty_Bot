fun main() {
    val lowerBound1 = readln().toInt()
    val upperBound1 = readln().toInt()
    val lowerBound2 = readln().toInt()
    val upperBound2 = readln().toInt()

    val input = readln().toInt()

    val within = input in lowerBound1..upperBound1 && input in lowerBound2..upperBound2
    println(
        within
    )
}