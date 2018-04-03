package currying

object CarryingTests {

  def main(args: Array[String]): Unit = {
    println(plainOldSum(1, 2))
    val intToInt: Int => Int = curriedSum(1)
    println(intToInt(2))

    val onePlus = curriedSum(1) _
    val onePlusExplicit = curriedSum(1)(_)
    println(onePlus(3))
    println(onePlusExplicit(3))

    val one = curriedSum3(1)_
    val two: Int => Int = one(1)
    val three: Int = two(1)

    println("three = " + three)

    val onePlusDef = plainOldSum(1, _: Int)
    println(onePlusDef(3))

    def first(x: Int) = (y: Int) => x + y

    println(first(1)(2))
  }

  def curriedSum(x: Int)(y: Int) = x + y

  def curriedSum3(x: Int)(y: Int)(z: Int) = x + y + z

  def plainOldSum(x: Int, y: Int) = x + y

}
