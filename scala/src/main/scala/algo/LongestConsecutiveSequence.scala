package algo;

import scala.collection.mutable.HashSet

/**
 * Solution for https://oj.leetcode.com/problems/longest-consecutive-sequence/
 * @author shaochuan.wang
 */
object LongestConsecutiveSequence {
  def getLcs(elements: Array[Int]) : Int = {
    val all = HashSet(elements: _*)
    all.foldLeft(0)((r, s) => {
      val remaining = all - s
      var lcs = 1
      var cursor = s
      while (remaining.contains( cursor + 1 )) {
        all.remove(cursor + 1)
        lcs += 1
        cursor += 1
      }
      Math.max(r, lcs)
    })
  }
}

