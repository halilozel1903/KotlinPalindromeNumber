## Kotlin Palindrome Number 3️⃣ 0️⃣ 3️⃣

![Kotlin Palindrome Number](https://inoxoft.com/wp-content/uploads/2018/12/Reasons-why-Kotlin-is-the-best-programming-language-for-Android-developers@3x-100-1.jpg)

A `palindrome` number is a number that remains the same when its digits are reversed. 
For example, 121, 1221, and 12321 are palindrome numbers.

Here's a program in `Kotlin` that finds palindrome numbers:

```kotlin
fun main() {
    for (number in 100..200) {
        if (number.toString() == number.toString().reversed()) {
            println("$number is a palindrome number")
        }
    }
}
```
The program defines a range of numbers to check for palindrome by using `100..200`. The `isPalindrome()` function checks if a number is a palindrome by converting it to a string and comparing the string to its reverse. The program then loops through the range of numbers and checks each one using the `isPalindrome()` function. If a number is a palindrome, the program prints a message to the console.

When we run the program, it will output all the palindrome numbers up to the limit we set:

```kotlin
101 is a palindrome number
111 is a palindrome number
121 is a palindrome number
131 is a palindrome number
141 is a palindrome number
151 is a palindrome number
161 is a palindrome number
171 is a palindrome number
181 is a palindrome number
191 is a palindrome number
```
## Donation 💸

If this project help 💁 you, Can you give me a cup of coffee? ☕

[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://www.buymeacoffee.com/halilozel1903)