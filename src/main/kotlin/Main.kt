fun main() {
    val range = 100..200 // define range of numbers to check for palindrome

    for (i in range) {
        if (isPalindrome(i)) {
            println("$i is a palindrome number")
        }
    }
}

fun isPalindrome(num: Int): Boolean {
    val str = num.toString() // convert number to string

    // check if string equals its reverse
    for (i in 0..str.length/2) {
        if (str[i] != str[str.length-i-1]) {
            return false
        }
    }
    return true
}
