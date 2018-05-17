import hide.Queue

class SlowAppendQueue[T](elems: List[T]) {
  def head = elems.head

  def tail = new SlowAppendQueue(elems.tail)

  def enqueue(x: T) = new SlowAppendQueue(elems ::: List(x)) // takes time proportional to the number of elements
}

class SlowHeadQueue[T](smele: List[T]) {
  def head = smele.last // takes time proportional to the number of elements
  def tail = new SlowAppendQueue(smele.init) // takes time proportional to the number of elements
  def enqueue(x: T) = new SlowAppendQueue(x :: smele)
}

// Optimized
class Queue[+T] private (
                private val leading: List[T],
                private val trailing: List[T]
              ) {

//  def this(elems: T*) = this(elems.toList, Nil)
//  def this() = this(Nil, Nil)

  private def mirror =
    if (leading.isEmpty)
      new Queue(trailing.reverse, Nil)
    else this

  def head = mirror.leading.head
  def tail = new Queue(mirror.leading.tail, mirror.trailing)
  def enqueue[U >: T](x: U) = new Queue(leading, x :: trailing)
}

// A neat(аккуратный) way to define a Queue
object Queue {
  def apply[T](elems: T*): Queue[T] = new Queue(elems.toList, Nil)
}



//class StrangeIntQueue extends Queue[Int] {
//  override def enqueue(x: Int) = {
//    println(math.sqrt(x))
//    super.enqueue(x)
//  }
//}



//object A extends App {
//
//  val x: Queue[Any] = new StrangeIntQueue
//
//
//
//
//  private val ints: List[Int] = List(1) ::: List(2)
//  println(ints)
//}