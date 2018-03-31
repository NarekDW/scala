import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}


val value =
  try {
    //  val f = new FileReader("input.txt")
    throw new IOException
  } catch {
    case ex: FileNotFoundException =>
      println("FileNotFoundException")
      11
    case ex: IOException =>
      println("IOException 1")
      println("IOException 2")
      println("IOException 3")
      println("IOException 4")
      println("IOException 5")
      12
    case ex: NumberFormatException =>
  } finally {
    println("Finally block")
    13
  }
value


def urlFor(path: String): URL =
  try new URL(path)
  catch {
    case e: MalformedURLException => new URL("http://www.scala-lang.org")
  }

urlFor("asd")

def f(): Int = try return 1 finally return 2
def g(): Int = try 1 finally 2
println(f + " - "+ g)