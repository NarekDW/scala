package structural_subtyping

// Loan pattern
class CloseMethod {

  def using[T <: { def close(): Unit}, S](obj: T)(op: T => S): S = {
    val res = op(obj)
    obj.close()
    res
  }

}

class A {
  def add(i: Int) = i
  def close(): Unit = println("close A")
}

class B {
  def add(i: Int) = i
  def close(): Int = {
    println("close B")
    22
  }
}

class C {
  def add(i: Int) = i
}


object CM extends App {
  val cm = new CloseMethod
  cm.using(new A)(_.add(12))
//  cm.using(new B)(_.add(12)) // ERROR
//  cm.using(new C)(_.add(12)) ERROR
}