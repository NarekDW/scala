
class Rational(n: Int, d: Int) {
  //    println(s"Created $n/$d")
  //  println("Created " + n + "/" + d) // Создаст первичный конструктр и поместит этот код туда!
  require(d != 0)

  // additional constructor
  def this(n: Int) = this(n, 1)

  // пойдет в первичный конструктор
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )


  def +(that: Rational) = new Rational(
    numer * that.denom + that.numer * denom,
    denom * that.denom)

  def +(int: Int) = new Rational(numer + int * denom, denom)


  def -(that: Rational) = new Rational(
    numer * that.denom - that.numer * denom,
    denom * that.denom)

  def -(int: Int) = new Rational(numer - int * denom, denom)


  def *(that: Rational) =
    new Rational(
      numer * that.numer,
      denom * that.denom)

  def *(int: Int) = new Rational(numer * int, denom)


  def /(that: Rational) = new Rational(
    numer * that.denom,
    denom * that.numer)

  def /(int: Int) = new Rational(numer, denom * int)


  override def toString = s"$numer/$denom"

  // НОД
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}


Thread.`yield`()

val x = new Rational(1, 3)
val y = new Rational(1, 2)
println(x + x * y)

val int = 2

println(x + int)


val r = new Rational(2, 3)
//2 * r  -  error
implicit def intToRational(x: Int) = new Rational(x)
println(2 * r)


