val args = Array("-arg1", "-arg2", "arg3.scala", "-arg4")

var i = 0
var foundIt = false
while (i < args.length && !foundIt) {
  if (!args(i).startsWith("-"))
    if (args(i).endsWith(".scala"))
      foundIt = true
  i = i + 1
}

println(i)

// recurs
def searchFrom(i: Int): Int =
  if (i >= args.length) -1 else
    if (args(i).startsWith("-")) searchFrom(i + 1) else
      if (args(i).endsWith(".scala")) i else searchFrom(i + 1)

println(searchFrom(0))


// availability to use break
import scala.util.control.Breaks._
breakable {
  var i = 0
  while (true) {
    println(i)
    i = i + 1
    if (i > 3) break
  }
}

//import java.io.{InputStream, InputStreamReader}
//
//val in = new BufferedReader(new InputStreamReader(System.in))
//
//breakable{
//  while (true) {
//    println("? ")
//    if (in.readLine() == " ") break
//  }
//}