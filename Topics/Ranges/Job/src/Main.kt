const val LOWER_BOUND_AGE = 18
const val UPPER_BOUND_AGE = 59

fun main() {
    val age = readln().toInt()

    val canWork = age in LOWER_BOUND_AGE..UPPER_BOUND_AGE

    println(canWork)
}