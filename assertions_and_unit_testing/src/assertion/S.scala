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
  } ensuring(_ > 0)

}
