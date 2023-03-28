import scala.annotation.tailrec

object Solution {
  def myAtoi(s: String): Int = {
    @tailrec
    def loop(in: List[Char], acc: Long, sign: Int): Int =
      in match {
        case _ if sign * acc < Int.MinValue => Int.MinValue
        case _ if sign * acc > Int.MaxValue => Int.MaxValue
        case h :: tail if h.isDigit         => loop(tail, acc * 10 + h.asDigit, sign)
        case _                              => sign * acc.toInt
      }

    s.trim.toList match {
      case '-' :: tail => loop(tail, 0, -1)
      case '+' :: tail => loop(tail, 0, 1)
      case str         => loop(str, 0, 1)
    }
  }

  private def runningSum(numbers: Array[Int]): Array[Int] = numbers.scan(0)(_ + _).tail

  private def pivotIndex(numbers: Array[Int]): Int = {
    val fromLeft  = numbers.scan(0)(_ + _).dropRight(1)
    val fromRight = numbers.scanRight(0)(_ + _).drop(1)
    fromLeft.zip(fromRight).zipWithIndex.find(pair => pair._1._1 == pair._1._2) match {
      case Some(res) => res._2
      case None      => -1
    }
  }

  private def searchInsert(numbers: Array[Int], target: Int): Int = numbers.search(target).insertionPoint

  private def lengthOfLastWord(s: String): Int = s.split(" +").last.length

  private def longestPalindrome(s: String): String = {
    val chars   = s.toCharArray()
    val n       = chars.length
    val dp      = Array.ofDim[Boolean](n, n) // dynamic programming table
    var longest = ""

    for (i <- n - 1 to 0 by -1) {
      for (j <- i until n) {
        dp(i)(j) = (chars(i) == chars(j)) && (j - i < 3 || dp(i + 1)(j - 1))
        if (dp(i)(j) && (j - i + 1) > longest.length) longest = s.substring(i, j + 1)
      }
    }

    longest
  }

  println(lengthOfLastWord("Hello world"))
//  println(searchInsert(Array(1, 3, 5, 6), 5))
//  println(pivotIndex(Array(1, 7, 3, 6, 5, 6)))
//  println(runningSum(Array(1, 2, 3, 4)).mkString("Array(", ", ", ")"))
}
