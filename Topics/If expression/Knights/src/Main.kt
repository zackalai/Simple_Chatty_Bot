import java.util.Scanner
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.next().toInt()
    val y1 = scanner.next().toInt()
    val x2 = scanner.next().toInt()
    val y2 = scanner.next().toInt()

    val distanceX = abs(x2 - x1)
    val distanceY = abs(y2 - y1)

    val canBeat1 = distanceX == 2 && distanceY == 1
    val canBeat2 = distanceY == 2 && distanceX == 1

    println(
        if (canBeat1 || canBeat2) "YES" else "NO"
    )
}