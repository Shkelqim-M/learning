object Euler extends App {
  println("* ** * " * 30 + "\n")
  val start = System.nanoTime()
  // --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---

  private val problem1 = (1 until 1000).view.filter(n => n % 3 == 0 || n % 5 == 0).sum
  println("problem one: \t" + problem1)

  private lazy val lazyList: LazyList[Int] = 0 #:: lazyList.scanLeft(1)(_ + _)
  private val problem2                     = lazyList.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum
  println("problem two: \t" + problem2)

  private def factors(n: Long): List[Long] =
    (2 to math.sqrt(n).toInt).find(n % _ == 0).fold(List(n))(i => i.toLong :: factors(n / i))
  println("problem three: \t" + factors(600851475143L).last)

  private val problem4 =
    (100 to 999).view.flatMap(i => (i to 999).map(_ * i)).filter(n => n.toString == n.toString.reverse).max

  println("problem four: \t" + problem4)

  // --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
  println("\n" + "* ** * " * 30)
  private val end = System.nanoTime()
  println((end - start) / 1000000.0 + " ms")
}
