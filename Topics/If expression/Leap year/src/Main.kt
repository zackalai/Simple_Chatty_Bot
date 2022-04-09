const val FOUR = 4
const val HUNDRED = 100
const val FOUR_HUNDRED = 400

fun main() {
    val year = readln().toInt()

    val leapYear = year % FOUR == 0 && year % HUNDRED != 0 || year % FOUR_HUNDRED == 0
    println(
        if (leapYear) "Leap" else "Regular"
    )
}