object Euler extends App {
  println("* ** * " * 30 + "\n")
  val start = System.nanoTime()
  // --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---

  private val problem1 = (1 until 1000).view.filter(n => n % 3 == 0 || n % 5 == 0).sum
  println("problem one: " + problem1)

  private lazy val lazyList: LazyList[Int] = 0 #:: lazyList.scanLeft(1)(_ + _)
  private val problem2                     = lazyList.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum

  println("problem two: " + problem2)

  val numbers = List(2, 5, 6)
  var res     = 1
  numbers.foreach(x => res *= x)
  println(res)

  val turing = Map("x" -> "morning", "y" -> "afternoon", "x" -> "evening")
  println(turing("x"))

  def superpower = "coding"
  // --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
  println("\n" + "* ** * " * 30)
  private val end = System.nanoTime()
  println((end - start) / 1000000.0 + " ms")
}
