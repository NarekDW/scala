package lazy_vals

class Demo {

  val x: String = {println("initializing X"); "done"}
  /*
    This is similar to the situation where x is defined as a parameterless
  method, using a def . However, unlike a def a lazy val is never evaluated
  more than once. In fact, after the first evaluation of a lazy val the result of the
  evaluation is stored, to be reused when the same val is used subsequently.
   */
  lazy val y: String = {println("initializing Y"); "done"}

  override def toString: String = "Done is here!"
}


object A extends App {
  val d = new Demo
  println("get Y")
  d.y
}

trait LazyRationalTrait {
  val numerArg: Int
  val denomArg: Int
  lazy val numer = numerArg / g
  lazy val denom = denomArg / g

  /*
    So lazy val's are an ideal complement to functional
  objects, where the order of initializations does not matter, as long as every-
  thing gets initialized eventually. They are less well suited for code that’s
  predominantly imperative.
   */
  private lazy val g = {
    require(denomArg != 0)
    gcd(numerArg, denomArg)
  }

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def toString = numer +"/"+ denom
}

object B extends App{
  new LazyRationalTrait {
    val numerArg = 1
    val denomArg = 2
  }
}