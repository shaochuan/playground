package algo

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class LongestConsecutiveSequenceSuite extends FunSuite with BeforeAndAfter {

  test("Empty array") {
    assertResult(0) {
      LongestConsecutiveSequence.getLcs(Array[Int]())
    }    
  }

  test("One element test.") {
    assertResult(1) {
      LongestConsecutiveSequence.getLcs(Array(1))
    }
  }

  test("Two elements test consecutive.") {
    assertResult(2) {
      LongestConsecutiveSequence.getLcs(Array(2,3))
    }
  }

  test("Two elements test inconsecutive.") {
    assertResult(1) {
      LongestConsecutiveSequence.getLcs(Array(1,3))
    }
  }

  test("Many elements test double consecutive.") {
    assertResult(4) {
      LongestConsecutiveSequence.getLcs(Array(100, 4, 200, 1, 3, 2))
    }
  }

  test("Many elements test double all consecutive.") {
    assertResult(8) {
      LongestConsecutiveSequence.getLcs(Array(7,1,5,2,3,8,4,6))
    }
  }
}