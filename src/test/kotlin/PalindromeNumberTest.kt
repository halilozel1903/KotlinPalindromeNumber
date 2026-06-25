import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeNumberTest {
    @Test
    fun `detects palindrome numbers`() {
        assertTrue(isPalindromeNumber(0))
        assertTrue(isPalindromeNumber(7))
        assertTrue(isPalindromeNumber(121))
        assertTrue(isPalindromeNumber(1221))
    }

    @Test
    fun `rejects non-palindrome and negative numbers`() {
        assertFalse(isPalindromeNumber(-121))
        assertFalse(isPalindromeNumber(123))
        assertFalse(isPalindromeNumber(120))
    }

    @Test
    fun `returns palindrome numbers in a range`() {
        assertEquals(
            listOf(101, 111, 121, 131, 141, 151, 161, 171, 181, 191),
            palindromeNumbersIn(100..200),
        )
    }
}
