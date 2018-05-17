package covariant

class Cell[T](init: T) {
  private[this] var current = init
  def get = current
  def set(x: T) { current = x }
}

object A extends App {

  val c1 = new Cell[String]("abc")
//  val c2: Cell[Any] = c1             Error
//  c2.set(1)
  val s: String = c1.get

}