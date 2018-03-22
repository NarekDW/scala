package scala

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