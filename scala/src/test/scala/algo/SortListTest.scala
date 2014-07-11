package algo

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class SortListSuite extends FunSuite with BeforeAndAfter {

  test("Empty list test.") {
    assertResult(Nil) {
      SortList.sort(Nil)
    }
    assertResult(Nil) {
      InsertionSortList.sort(Nil)
    }
  }
  test("One element list test.") {
    assertResult(List(1)) {
      SortList.sort(List(1))
    }
    assertResult(List(1)) {
      InsertionSortList.sort(List(1))
    }
  }
  test("Two element list test.") {
    assertResult(List(1, 2)) {
      SortList.sort(List(2, 1))
    }
    assertResult(List(1, 2)) {
      SortList.sort(List(1, 2))
    }
    assertResult(List(1, 2)) {
      InsertionSortList.sort(List(2, 1))
    }
    assertResult(List(1, 2)) {
      InsertionSortList.sort(List(1, 2))
    }
  }
  test("Three element list test.") {
    assertResult(List(1, 2, 3)) {
      SortList.sort(List(1, 3, 2))
    }
    assertResult(List(1, 2, 3)) {
      SortList.sort(List(3, 2, 1))
    }
    assertResult(List(1, 2, 3)) {
      SortList.sort(List(2, 1, 3))
    }
    assertResult(List(1, 2, 3)) {
      SortList.sort(List(1, 2, 3))
    }
    assertResult(List(1, 2, 3)) {
      InsertionSortList.sort(List(1, 3, 2))
    }
    assertResult(List(1, 2, 3)) {
      InsertionSortList.sort(List(3, 2, 1))
    }
    assertResult(List(1, 2, 3)) {
      InsertionSortList.sort(List(2, 1, 3))
    }
    assertResult(List(1, 2, 3)) {
      InsertionSortList.sort(List(1, 2, 3))
    }
  }
}