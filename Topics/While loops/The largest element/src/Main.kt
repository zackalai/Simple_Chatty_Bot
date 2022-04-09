fun main() {
    var n = readln().toInt()
    var max = 0

    while (n != 0) {
        if (n > max) max = n
        n = readln().toInt()
    }
    println(max)
}