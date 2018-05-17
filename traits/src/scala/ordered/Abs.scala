package ordered

class Abs(val v: String) extends Ordered[Abs] {
  override def compare(that: Abs): Int = this.v.length - that.v.length
}

object Main extends App {
  val a1 = new Abs("asd")
  val a2 = new Abs("aasdf")
  println(a1 > a2)
  println(a1 >= a2)
  println(a1 < a2)
  println(a1 <= a2)

//  println(List(1, 2, 3) map show mkString ", ")
}