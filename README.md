# Kotlin Palindrome Number 303

A small, modern Kotlin/JVM console project that prints palindrome numbers in the `100..200` range.

A **palindrome number** reads the same from left to right and right to left. Examples: `121`, `1221`, and `12321`.

## What is included

- Kotlin/JVM project configured with Gradle Kotlin DSL.
- Numeric palindrome detection without converting numbers to strings.
- Reusable `isPalindromeNumber` and `palindromeNumbersIn` functions.
- Unit tests for positive, negative, and range-based cases.
- Gradle Wrapper updated to Gradle `9.6.0`.

## Requirements

- JDK `17` or newer. Kotlin compiles to JVM 17 bytecode.
- No local Gradle installation is required; use the included Gradle Wrapper.

## Run

```bash
./gradlew run
```

Expected output:

```text
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

## Test

```bash
./gradlew test
```

## Core implementation

```kotlin
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
```

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE).
