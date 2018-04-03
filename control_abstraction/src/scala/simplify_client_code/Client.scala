package simplify_client_code

object Client {

  def main(args: Array[String]): Unit = {

    println(s"1 - ${containsNeg(List(1, 2, 3, 4))}")
    println(s"2 - ${containsNeg(List(1, 2, -3, 4))}")

    // OR
    println(s"3 - ${List(1, 2, -3, 4).exists(_ < 0)}")

    println(s"4 - ${containsOdd(List(1, 2, 3, 4))}")
    println(s"5 - ${List(1, 2, 3, 4).exists(_ % 2 == 1)}")

  }

  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0) exists = true
    exists
  }

  def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num % 2 == 1) exists = true
    exists
  }
}
