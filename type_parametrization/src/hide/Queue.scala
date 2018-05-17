package hide

trait Queue[+T] {
  def head: T
  def tail: Queue[T]
  def enqueue[U >: T](x: U): Queue[U]
}

object Queue {

  def apply[T](xs: T*): Queue[T] = new QueueImpl(xs.toList, Nil)

  private class QueueImpl[T](
                         private val leading: List[T],
                         private val trailing: List[T]
                         ) extends Queue[T] {

    def mirror: QueueImpl[T] =
      if (leading.isEmpty) new QueueImpl(trailing.reverse, Nil)
      else this

    override def head: T = mirror.leading.head

    override def tail: Queue[T] = new QueueImpl(mirror.leading.tail, trailing)

    override def enqueue[U >: T](x: U): Queue[U] = new QueueImpl(leading, x :: trailing)
  }

}

object A extends App {
//  private val q = Queue(1, 2, 3)
//  private val d: Queue[Double] = q enqueue(5.5)
//  println(d)
}

class B[+T](x: T)
class D[+T](x: T)


//object A extends App {
//
//  val i1 = new B(1)
//  val s1 = new B("a")
//  compile2(i1)
//  compile2(s1)
//  def compile2(b: B[Any]) = ???
//
//  val i = Queue(1, 2, 3)
//  val s = Queue("a", "b")
//
////  compile(i)
//
//  def compile(q: Queue[Any]) = ???
//
//}
