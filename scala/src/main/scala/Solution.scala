object Solution extends App {
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

  println(lengthOfLastWord("Hello world"))
//  println(searchInsert(Array(1, 3, 5, 6), 5))
//  println(pivotIndex(Array(1, 7, 3, 6, 5, 6)))
//  println(runningSum(Array(1, 2, 3, 4)).mkString("Array(", ", ", ")"))
}
