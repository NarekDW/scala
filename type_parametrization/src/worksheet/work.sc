class Queue2[+T] private(
                         val leading: List[T],
                         val trailing: List[T]
                       ) {

  private def mirror =
    if (leading.isEmpty) new Queue2(trailing.reverse, Nil) else this

  def head: T = mirror.leading.head

  def tail: Queue2[T] = new Queue2(mirror.leading.tail, mirror.trailing)

  def enqueue[U >: T](x: U): Queue2[U] = new Queue2(leading, x :: trailing)
}

object Queue2 {
  def apply[T](elems: T*): Queue2[T] = new Queue2(elems.toList, Nil)
}

val q1 = Queue2(1, 2, 3)
val q2: Queue2[AnyVal] = q1.enqueue(1.0)
println(q2)

