import scala.io.StdIn

// Imperative
var fileName = "default.txt"
if (!args.isEmpty)
  fileName = args(0)

val filename = if (!args.isEmpty) args(0) else "default.txt"


val i = if (1 > 2) {
  1
} else {
  2
}


var line = ""

val unit2 = line = readLine()

val value: Unit = do {
  line = StdIn.readLine()
  println("Read: " + line)
} while (line != "")


val unit: Unit = ("Hi" == 1)

val x = "sda"


var a = 1
val unit3: Unit = a = 2