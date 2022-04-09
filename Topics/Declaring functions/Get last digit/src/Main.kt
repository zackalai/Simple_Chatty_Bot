const val TEN = 10

fun getLastDigit(number: Int): Int {
    return kotlin.math.abs(number) % TEN
}
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
