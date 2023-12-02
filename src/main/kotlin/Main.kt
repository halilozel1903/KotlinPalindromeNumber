fun main() {
    for (number in 100..200) {
        if (number.toString() == number.toString().reversed()) {
            println("$number is a palindrome number")
        }
    }
}
