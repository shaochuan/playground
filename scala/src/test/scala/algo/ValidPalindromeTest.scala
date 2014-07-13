package algo

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class ValidPalindromeSuite extends FunSuite with BeforeAndAfter {

  test("Empty string") {
    assertResult(true) {
      ValidPalindrome.isValid("")
    }    
  }

  test("One char test.") {
    assertResult(true) {
      ValidPalindrome.isValid("a")
    }
  }

  test("Two chars vaid palindrome test.") {
    assertResult(true) {
      ValidPalindrome.isValid("aa")
    }
  }

  test("Two chars invaid palindrome test.") {
    assertResult(false) {
      ValidPalindrome.isValid("ab")
    }
  }

  test("Sentence with non-alphabets vaid palindrome test.") {
    assertResult(true) {
      ValidPalindrome.isValid("A man, a plan, a canal: Panama")
    }
  }

  test("Sentence with non-alphabets invaid palindrome test.") {
    assertResult(false) {
      ValidPalindrome.isValid("race a car")
    }
  }
}