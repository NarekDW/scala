class ChecksumAccumulator {
  private var sum = 0

  ChecksumAccumulator.cache // private

  def add(b: Byte): Unit = sum += b // Процедура
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {

  import scala.collection.mutable

  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator

      acc.sum // private

      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum
      cache += (s -> cs)
      cs
    }
}


List.apply()

println(ChecksumAccumulator.calculate("Ever"))
println(ChecksumAccumulator.calculate("Never"))
println(ChecksumAccumulator.calculate("Ever"))

val check = new ChecksumAccumulator
val check2 = ChecksumAccumulator
println(check.checksum)
println(check2.calculate("as"))

val test = "test"
for (t <- test)
  println(t)
//t
//e
//s
//t


class A(val a:String, val b:String) {}
object A {
  def apply(a: String, b: String): A = new A(a, b)
}

val ac = new A("a", "b")
val ao = A("a", "b") // call apply method
println("c = "+ac.a)
println("o = "+ao.a)