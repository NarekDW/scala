package assertion

object S {

  def main(args: Array[String]): Unit = {

    assert(5 == 5)
    //    assert(5 == 6)
    //    assert(5 == 6, "some explanation here")

    m(-100)
  }

  def m(int: Int) = {
    int + 10
  } ensuring (_ > 0)


  def caseMet(any: Any) = {
    any match {
      case A => ???
      case B => ???
      //      case C => ???
    }
  }
}

case class A(int: Int)

case class B(int: Int)

class C(int: Int) {
  def this(int: Int, a: String) {
    this(int)
  }
}



