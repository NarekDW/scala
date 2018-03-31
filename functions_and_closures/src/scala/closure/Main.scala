package closure

object Closure {


  def main(args: Array[String]): Unit = {
    var more = 1
    val closure = (x: Int) => x + more
    println(closure(1))
    more = 2
    println(closure(1))

    more = 0
    val closure2 = (x: Int) => more += x
    List(-2, -1, 0, 1, 2, 3).foreach(closure2)
    println(more)


    def makeIncreaser(more: Int) = (x: Int) => x + more
    val makeIncreaser1 = makeIncreaser(1)
    val makeIncreaser99 = makeIncreaser(99)

    println(makeIncreaser1(10))
    println(makeIncreaser99(10))
  }


}
