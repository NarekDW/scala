import scala.io.Source

if (args.length > 0) {
  for (line <- Source.fromFile(args(0)).getLines())
    println(line.length + " : " + line)
} else
  Console.err.println("Please enter file name")


val s = "12345 asd as das d asd  asd ad asda \n"
println("s.length.toString.length = " + s.length.toString.length)
println("s.length = " + s.length)

var width = 0
println(width max s.length)

val ints = List(1, 2, 3, 4, 5, 10, 1, 2, 3, 4)

// With var
var max = 0
for (i <- ints)
  max = max.max(i)
println(max)

// Without var
//val max2 = ints.reduceLeft((value, i) => value.max(i))
val max2 = ints.reduceLeft((value, i) => if (value > i) value else i) // the same
println(max2)



val str = " " * 15
println("str = " + str + "end")