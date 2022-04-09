fun isVowel(ch: Char): Boolean {
    val chLowerCase = ch.lowercaseChar()
    val vowel = arrayOf('a', 'e', 'i', 'o', 'u')
    return chLowerCase in vowel
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}