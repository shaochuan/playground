package algo

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class ReorderListSuite extends FunSuite with BeforeAndAfter {

  test("Empty list test.") {
    assertResult(Nil) {
      ReorderList.reorder(Nil)
    }    
  }

  test("One element list test.") {
    assertResult(List(1)) {
      ReorderList.reorder(List(1))
    }
  }

  test("Two elements list test.") {
    assertResult(List(1, 2)) {
      ReorderList.reorder(List(1, 2))
    }
  }

  test("Three elements list test.") {
    assertResult(List(1, 3, 2)) {
      ReorderList.reorder(List(1, 2, 3))
    }
  }

  test("Four elements list test.") {
    assertResult(List(1, 4, 2, 3)) {
      ReorderList.reorder(List(1, 2, 3, 4))
    }
  }
}