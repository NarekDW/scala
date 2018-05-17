package covariant

object ArrayScala extends App {
  val a1 = Array("abc")
//  val a2: Array[Any] = a1   // error: type mismatch

  // Have to do cast
  val a2: Array[Any] = a1.asInstanceOf[Array[Any]]
//  val a2: Array[Int] = a1.asInstanceOf[Array[Int]]      ERRORORORRO
}