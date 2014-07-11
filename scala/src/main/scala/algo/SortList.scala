package algo;

/**
 * Solution for https://oj.leetcode.com/problems/sort-list/
 * @author shaochuan.wang
 */
object SortList {
  /**
   * Recursive version of merge. (Can we do better?) 
   */
  final def merge(left: List[Int], right: List[Int]) : List[Int] = left match {
    case Nil => right
    case l::ls => {
      right match {
        case Nil => left
        case r::rs => {
          if (l <= r) {
            l::merge(ls, right)
          } else {
            r::merge(left, rs)
          }
        }
      }
    }
  }
  /**
   * Divide and conquer. Merge sort.
   */
  def sort(elements: List[Int]) : List[Int] = {
    if (elements.size <= 1) {
      elements
    } else {
      val size = elements.size
      merge(sort(elements.slice(0, size/2)), sort(elements.slice(size/2, size)))
    }
  }
}