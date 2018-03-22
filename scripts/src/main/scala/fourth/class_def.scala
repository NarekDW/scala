
class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = sum += b // Процедура
  def checksum(): Int = ~(sum & 0xFF) + 1
}

val acc = new ChecksumAccumulator
val csa = new ChecksumAccumulator

acc.add(10)
println(acc.checksum())

val s = "hello"; println(s)

if (1 < 2) println("1") else println("2")
// ==
if (1 < 2)
  println("1")
else
  println("2")

val r = 1
+2
println(s"r = ${r}") // 1

val r2 = (1
+2)
println(s"r = ${r2}") // 3

val r3 = 1 +
  2
println(s"r = ${r3}") // 3
