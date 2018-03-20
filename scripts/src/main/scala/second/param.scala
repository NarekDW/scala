import java.math.BigInteger

import scala.Console._

val big = new BigInteger("12345")

val greeting = new Array[String](3)
greeting(0) = "Hello"
greeting(1) = ", "
greeting(2) = "World!"

for (i <- 0 to 2)
  print(greeting(i))
println



Console println 25