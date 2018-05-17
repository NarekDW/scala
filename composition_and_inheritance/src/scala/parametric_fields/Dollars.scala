package parametric_fields

class Dollars(val amount: Int) extends AnyVal {
  override def toString: String = "$"+amount
}

object T {
  def main(args: Array[String]): Unit = {
    val dollars = new Dollars(10)
    println(dollars)
  }
}
