package stackable

import scala.collection.mutable.ArrayBuffer

trait IntQueue {
  def get: Int

  def put(x: Int)
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int): Unit = {
    super.put(666)
  }
}


trait Doubling2 extends IntQueue {
  abstract override def put(x: Int): Unit = {
    super.put(777)
  }

  abstract override def get: Int = 1010101
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int): Unit = super.put(x + 1)
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int): Unit =  if (x > 0) super.put(x)
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]

  override def get: Int = buf.remove(0)

  override def put(x: Int): Unit = {
    buf += x
  }
}

class DoublingIntQueue extends BasicIntQueue with Doubling2 with Doubling

trait A {
  def a = 1
}

trait B {
  def a = 2
}

class C extends A with B {
  override def a: Int = super.a
}


object Main extends App {
  private val c = new C
  println(c.a)



  private val queue = new DoublingIntQueue
  queue.put(10)
  println(queue.get)

  private val queue2 = new BasicIntQueue with Doubling2
  queue2.put(111)
  println(queue2.get)

  println("Incrementing")
  private val incrementing = new BasicIntQueue with Incrementing
  incrementing.put(10)
  println(incrementing.get)

  println("Filtering")
  private val filter = new BasicIntQueue with Filtering
  filter.put(-10)
  filter.put(10)
  println(filter.get)

  println("Incrementing and filtering")
  val IncrAndFilt = new BasicIntQueue with Filtering with Incrementing
  IncrAndFilt.put(0)
  println(IncrAndFilt.get)

}
