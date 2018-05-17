package pre_initialized_fields

import vals.RationalTrait

/*
  Pre-initialized fields are initialized before the superclass constructor is called
 */
object Pre extends App {

  // Error
//  new RationalTrait{
//    override val numerArg: Int = 1
//    override val denomArg: Int = 1
//  }

  val x = 10

  new {
    override val numerArg = 1 * x
    override val denomArg = 2 * x
  } with RationalTrait


  new {
    val numerArg = 1 * x
    val denomArg = 2 * x
  } with RationalTrait


  object twoThirds extends {
    val numerArg = 2
    val denomArg = 3
  } with RationalTrait


  class twoThirds2 extends {
    val numerArg = 2
    val denomArg = 3
  } with RationalTrait

//  new {
//    val numerArg = 1
//    val denomArg = this.numerArg * 2 // error
//  } with RationalTrait

  print("Done")
}


//class RationalClass(n: Int, d: Int) extends {
//  val numerArg = n
//  val denomArg = d
//} with RationalTrait {
//  def + (that: RationalClass) = new RationalClass(
//    n * that.d + that.n * d,
//    d * that.d
//  )
//}