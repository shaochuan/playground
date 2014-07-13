package algo;

/**
 * Solution for https://oj.leetcode.com/problems/valid-palindrome/
 * @author shaochuan.wang
 */
object ValidPalindrome {
  def isValid(sentence: String) : Boolean = {
    val words = sentence.toArray.filter(_.isLetterOrDigit).map(_.toLower)
    words.reverse sameElements words
  }
}

