package algo;

/**
 * Solution for https://oj.leetcode.com/problems/reorder-list/
 * @author shaochuan.wang
 */
object ReorderList {

  /**
   * Merge two lists.
   * @type {[type]}
   */
  def merge(left: List[Int], right: List[Int]) : List[Int] = left match {
    case Nil => right
    case l::ls => right match {
      case Nil => left
      case r::rs => {
        l::r::merge(ls, rs)
      }
    }
  }

  /**
   * Reorder the list
   * @type {[type]}
   */
  def reorder(elements: List[Int]) : List[Int] = {
    if (elements.size <=1 ) {
      elements
    } else {
      val size = elements.size
      val left = elements.slice(0, size/2)
      val right = elements.slice(size/2, size)
      merge(left, right.reverse)
    }
  }
}