package sss

class Queue[+T] private (
                private val leading: List[T],
                private val trailing: List[T]
              ) {

  private def mirror =
    if (leading.isEmpty)
      new Queue(trailing.reverse, Nil)
    else this

  def head: T = mirror.leading.head
  def tail: Queue[T] = new Queue[T](mirror.leading.tail, mirror.trailing)
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