private const val START = 100
private const val END_INCLUSIVE = 200

fun isPalindromeNumber(number: Int): Boolean {
    if (number < 0) return false

    var remaining = number
    var reversed = 0

    while (remaining > 0) {
        reversed = reversed * 10 + remaining % 10
        remaining /= 10
    }

    return number == reversed
}

fun palindromeNumbersIn(range: IntRange): List<Int> = range.filter(::isPalindromeNumber)

fun main() {
    palindromeNumbersIn(START..END_INCLUSIVE).forEach { number ->
        println("$number is a palindrome number")
    }
}
