const val D = 2
const val C = 3
const val B = 4

fun main() {
    val n = readln().toInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0

    repeat(n) {
        when (readln().toInt()) {
            D -> ++d
            C -> ++c
            B -> ++b
            else -> ++a
        }
    }

    println("$d $c $b $a")
}