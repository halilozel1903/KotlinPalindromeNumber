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

## License ℹ️
```
MIT License

Copyright (c) 2025 Halil OZEL

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```