package simple

sealed abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

class B extends Expr

class A(val i: Int)

object Ops extends App {

  val expr = simplifyTop(Number(2))
  println(expr)

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", x)) => x
    case BinOp("+", x, Number(0)) => x
    case BinOp("*", x, Number(1)) => x
    case BinOp(_, _, _) => expr
    case x => Number(10101010)
    case _ => expr
  }


  println("\n\nDescribe")
  println(constant(true))
  println(constant("hello"))
  println(constant(List()))
  println(constant(5))
  println(constant(AnyRef))

  def constant(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi"
    case Nil => "the empty List"
    case _ => "some thing else"
  }


  println("\n\nVariable")
  println(variable(12))

  def variable(x: Any) = x match {
    case 0 => "zero"
    case someThingElse => "not zero: " + someThingElse
  }


  import math.E
  import math.Pi

  const(E)
  const(Pi)

  def const(any: Any) = any match {
    case Pi => println("got Pi = " + Pi)
    case _ => println("Not a Pi")
  }

  val pi = Pi
  const2(E)
  const2(Pi)

  def const2(any: Any) = any match {
    case `pi` => println("got Pi = " + pi)
    case _ => println("Not a Pi")
  }


  def constructor(expr: Expr) = expr match {
    case BinOp("+", e, BinOp("-", a, x)) => println("deep matches")
  }

  println("\n\nSequence")
  sequence(List(0, 2, 3))
  sequence(List(0, 2))
  sequence(List(1, 2))
  sequence(List(2))
  sequence(12)

  def sequence(any: Any) = any match {
    case List(0, _, _) => println("List with 3 el")
    case List(_*) => println("With e")
    case _ => println("default")
  }

  println("\n\nTuple")
  tuple((1, 2))
  tuple(("1", "2"))

  def tuple(any: Any) = any match {
    case (a, b: Int) => println(a + ":" + b + " Int")
    case (a, b) => println(a + ":" + b)
  }


  println("\n\nTyped")
  println(typed("abc"))
  println(typed(Map(1 -> "a", 2 -> "b")))
  println(typed(pi))

  def typed(any: Any) = any match {
    case s: String => s.length
    case m: Map[_, _] => m.size
    //    case m: Map[k, v] =>
    case _ => -1
  }


  //  println(1.isInstanceOf[String])
  //  println(1.asInstanceOf[String])


  println("\n\nType ensure")
  println(isMapIntInt(Map("abc" -> "abc"))) // true
  println(isMapIntInt(Map("abc" -> 1))) // true
  println(isMapIntInt(Map(1 -> "abc"))) // true
  println(isMapIntInt(Map(1 -> 1))) // true
  def isMapIntInt(any: Any) = any match {
    case m: Map[Int, Int] => true
    case _ => false
  }

  println("\nisStringArray")
  isStringArray(Array(1, 2)) // Int
  isStringArray(Array("abc", "Abc")) // String
  isStringArray(Array()) // Other

  def isStringArray(any: Any) = any match {
    case s: Array[String] => println("String")
    case i: Array[Int] => println("Int")
    case _ => println("Other")
  }


  println("\n\nVariable binding")
  println(varBind(UnOp("-", UnOp("-", Number(1)))))

  def varBind(expr: Expr) = expr match {
    case UnOp("-", e @ UnOp("-", _)) => e
    case b: B => b
  }


  println()
  println(simplifyAll(UnOp("-", UnOp("-", Number(10)))))
  println(simplifyAll(BinOp("+", Number(10), Number(0))))
  println(simplifyAll(BinOp("*", Number(10), Number(1))))
  println(simplifyAll(BinOp("+",
    UnOp("-", UnOp("-", Number(10))),
    BinOp("+", Number(10), Number(0)))
  ))

  def simplifyAll(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => simplifyAll(e)
    case BinOp("+", e, Number(0)) => simplifyAll(e)
    case BinOp("*", e, Number(1)) => simplifyAll(e)
    case UnOp(op, e) => UnOp(op, simplifyAll(e))
    case BinOp(op, e, x) => BinOp(op, simplifyAll(e), simplifyAll(x))
    case _ => expr
  }

  def describe(expr: Expr) = expr match {
    case Number(_) => "a"
    case Var(_) => "b"
  }

  // get rid of warnings
  def describe2(expr: Expr) = expr match {
    case Number(_) => "a"
    case Var(_) => "b"
    case _ => throw new RuntimeException
  }

  // get rid of warnings - better to use annotation
  def describe3(expr: Expr) = (expr: @unchecked) match {
    case Number(_) => "a"
    case Var(_) => "b"
  }


}

object M extends App {
  // Factory method with the name of class
  val v = Var("x") // instead new Var("x")
  val op = BinOp("+", Number(1), v)
  println(op.left)
  println(op.right == v)
  println(op.hashCode())

  // copy method
  //  val op2 = op.copy("-")
  val op2 = op.copy(operator = "-")
  println(op2)


  val a = new A(10)
  val a2 = new A(10)
  println(a) // simple.A@668bc3d5
  println(a == a2) // false

}