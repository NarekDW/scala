package reasignable

class Queue[+T] private (
                          private[this] var leading: List[T],
                          private[this] var trailing: List[T]
                        ) {

  private def mirror() =
    if (leading.isEmpty){
      while (trailing.nonEmpty){
        leading = trailing.head :: leading
        trailing = trailing.tail
      }
    }

  def head: T = {
    mirror()
    leading.head
  }

  def tail: Queue[T] = {
    mirror()
    new Queue(leading.tail, trailing)
  }

  def enqueue[U >: T](x: U): Queue[U] = new Queue(leading, x :: trailing)
}

object Queue {
  def apply[T](elems: T*): Queue[T] = new Queue(elems.toList, Nil)
}

object A extends App {
  println("Hi!")
  val q = Queue(1, 2, 3)
  val value: Queue[AnyVal] = q enqueue(4.0)
  println(value)
  println(value.tail.tail.tail.head)
}