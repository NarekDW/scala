package covariant

class B[+T](x: T)
class D[T](x: T)
class C[-T](x: T)


object CovariantScala extends App {

  val i1 = new B(1)
  val s1 = new B("a")
//  val any = new B[Any]
//  compile1(any)
  compile1(i1)
  compile1(s1)
  def compile1(b: B[Any]) = ???

  val i2 = new D(1)
  val s2 = new D("a")
//  compile2(i1)
//  compile2(s1)
  def compile2(d: D[Any]) = ???

  val i3 = new C[Any](1)
  compile3(i3)
  def compile3(c: C[Int]) = ???


}

