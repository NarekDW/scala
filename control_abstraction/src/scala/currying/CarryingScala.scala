package currying

object CarryingScala {

  def main(args: Array[String]): Unit = {
    def curriedSum(x: Int)(y: Int) = x + y

    val onePlus = curriedSum(1)_
    println(s"1 + 2 = ${onePlus(2)}")
  }

}
