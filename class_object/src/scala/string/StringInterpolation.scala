package scala.string

object StringInterpolation extends App {

  val user = "Narek"

  println(s"Hello, $user!")
  println(s"Hello, ${10 + 1 - 2}!")

  println(raw"No\\\\escape!")
  println(s"No\\\\escape!")

  println(f"${math.Pi}%.5f")

  // Infix notation
  println("abc" indexOf 'c')
  println("abcabc" indexOf('c', 3))

  println(this sum(2, 3, 4, 5))

  private def sum(a: Int, b: Int, c: Int, d: Int) = {
    a + b + c + d
  }

  // Infix
  println(-7)
  // Postfix
  println(7 toLong)

  println((2.0).unary_- == -2.0)

  println(100 >>> 1) // 50


  println(List(1, 2, 3) == List(1, 2, 3)) // true
  println(List(1, 2, 3) == List(3, 2, 1)) // false
  println(List(1, 2, 3) == List(3, 1, 2)) // false

  println(List(1, 2, 3).eq(List(1, 2, 3))) // Compare References
  println(List(1, 2, 3).ne(List(1, 2, 3))) // Compare References

  println(List(33) ::: List(2))
  println(1 :: List(2))


  println(s"max = ${0 max 6}")
  println(s"min = ${0 min 6}")

  println(s"abs = ${-2.7 abs}")
  println(s"round = ${-2.7 round}")
  println(s"infinity = ${(1.0/0) isInfinite}")
  println(s"range = ${2 to 5}")
  println(s"capitalize = ${"erevan" capitalize}")
  println(s"drop = ${"Robert" drop 2}")
  


}