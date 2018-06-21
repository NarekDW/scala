val oneHalf = new Rational(1, 2)
oneHalf + oneHalf
oneHalf + 1
//1 + oneHalf // ERROR

implicit def int2Rational(int: Int): Rational = new Rational(int, 1)

1 + oneHalf

/*
    What happens behind the scenes here is that Scala compiler first tries to type
  check the expression 1 + oneHalf as it is. This fails because Int has several
  + methods, but none that takes a Rational argument. Next, the compiler
  searches for an implicit conversion from Int to another type that has a +
  method which can be applied to a Rational . It finds your conversion and
  applies it, which yields:

  intToRational(1) + oneHalf

 */

val int = 1
int.isWhole() // RichInt


class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  def this(n: Int) = this(n, 1)
  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)
  def - (that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  def * (i: Int): Rational =
    new Rational(numer * i, denom)
  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
  def / (i: Int): Rational =
    new Rational(numer, denom * i)
  override def toString = numer +"/"+ denom
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}