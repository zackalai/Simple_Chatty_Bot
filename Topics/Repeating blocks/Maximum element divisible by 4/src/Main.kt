const val FOUR = 4

fun main() {
    val n = readln().toInt()
    var max = 0

    repeat(n) {
        val seq = readln().toInt()
        if (seq % FOUR == 0 && seq > max) {
            max = seq
        }
    }

    println(max)
}