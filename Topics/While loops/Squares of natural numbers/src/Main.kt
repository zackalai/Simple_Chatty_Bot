import kotlin.math.sqrt

fun main() {
    val num = readln().toDouble()
    val numSqrt = sqrt(num).toInt()
    var i = 1
    for (i in i..numSqrt) {
        println(i * i)
    }
}