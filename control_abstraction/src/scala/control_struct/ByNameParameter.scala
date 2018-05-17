package control_struct

object ByNameParameter {

  def main(args: Array[String]): Unit = {
    myAssert({
      println("evaluate expression")
      5 > 3
    })
    println
    boolAssert({
      println("evaluate expression")
      5 > 3
    })

    assertionsEnabled = false
    myAssert(1/0 == 0)
    boolAssert(1/0 == 0)
  }

  var assertionsEnabled = true

  def myAssert(predicat: => Boolean) = {
    println("Evaluate method myAssert")
    if (assertionsEnabled && !predicat)
      throw new AssertionError
  }

  def boolAssert(predicat: Boolean) = {
    println("Evaluate method boolAssert")
    if (assertionsEnabled && !predicat)
      throw new AssertionError
  }

}
