import scala.collection.mutable.ListBuffer

val buf = new ListBuffer[Int]
for (x <- 1 to 10)
  buf += x + 10
buf.toList