package algo;

import scala.collection.mutable.MutableList

/**
 * Solution for https://oj.leetcode.com/problems/insertion-sort-list/
 * @author shaochuan.wang
 */
object InsertionSortList {

  /**
   * Use mutable list to perform insertion sort.
   * @type {[type]}
   */
  def sort(elements: List[Int]) : List[Int] = {
    val results = new MutableList[Int]()
    results ++= elements
    for (ind <- 0 to results.size) {
      val subList = results.view(ind, results.size)
      if (!subList.isEmpty) {
        val minVal = subList.min
        val minInd = results.indexOf(minVal)
        val thisVal = results.get(ind).get
        results.update(ind, minVal)
        results.update(minInd, thisVal)
      }
    }
    results.toList
  }
}