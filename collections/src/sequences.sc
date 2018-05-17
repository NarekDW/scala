// List
val colors = List("yellow", "red", "blue")
colors(2)

// Array
val arr = Array(1, 2, 3, 4)
val empty = new Array[Int](5)

empty(0) = arr(3)
empty

//arr += 1

// ListBuffer
import scala.collection.mutable.ListBuffer

val buf = new ListBuffer[Int]

buf += 1
buf += 2
3 +=: buf
buf.toList

// ArrayBuffer
import scala.collection.mutable.ArrayBuffer

val arrBuf = new ArrayBuffer[Int]()
arrBuf += 11
arrBuf += 12
arrBuf(0)
arrBuf.length
arrBuf -= 11

// String (via StringOps)
def hasUpperCase(s: String) = s.exists(_.isUpper)
hasUpperCase("Hello World")
hasUpperCase("hi my love")
case class A(i: Int) {
  def +(a: A) = this.i + a.i
}

implicit def intToA(int: Int) = A(int)

A(1) + A(2)
1 + A(3)