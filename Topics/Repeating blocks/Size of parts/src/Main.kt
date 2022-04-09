fun main() {
    val n = readln().toInt()
    var perfectNum = 0
    var rejectNum = 0
    var largerNum = 0

    repeat(n) {
        val detectSeq = readln().toInt()
        if (detectSeq == 0) {
            perfectNum += 1
        }
        if (detectSeq == 1) {
            largerNum += 1
        }
        if (detectSeq == -1) {
            rejectNum += 1
        }
    }

    println("$perfectNum $largerNum $rejectNum")
}