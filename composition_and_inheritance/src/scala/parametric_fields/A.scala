package parametric_fields

class A(a: Int, val b: Int)

object B {
  def main(args: Array[String]): Unit = {
    val a = new A(1, 2)
    //    println(a.b)
    //    a.a error
    val map = Map("a" -> 1)
    val maybeInt: Option[Int] = map.get("a")


    val ints = List(2, 3, 4, 5, 6, 7)
    //    ints.takeWhile(_ < 6).foreach(println(_))
    println(ints.span(_ < 6)._1.mkString(" "))
    println(ints.span(_ < 6)._2.mkString(" "))

    println("reduceLeft")
    ints.reduceLeft((value: Int, i: Int) => {
      println(value + ":" + i)
      value + i
    })
    println("reduceRight")
    ints.reduceRight((value: Int, i: Int) => {
      println(value + ":" + i)
      value + i
    })

    println("foldLeft")
    ints.foldLeft(10)((i: Int, i0: Int) => {
      println(i + ":" + i0)
      i + i0
    })
    println("foldRight")
    ints.foldRight(10)((i: Int, i0: Int) => {
      println(i + ":" + i0)
      i + i0
    })

    println("forall - " + ints.forall(_ > 5))

    val strings = List("a", "b", "c", "d", "e")
    val pairs = ints zip strings
    println("zip")
    pairs.foreach(println(_))
    val tuple = pairs.unzip
    println("unzip")
    println(tuple._1 + ":" + tuple._2)


    println("sum - " + ints.sum)
    println("product - " + ints.product)

    val flatten = List(List(1, 2), List(3, 4)).flatten
    println(flatten.mkString(" "))

    val leading = 111 +: ints
    println("leading - "+leading)

    val trailing = ints :+ 111
    println("trailing - "+trailing)

  }
}
