package functions

import scala.io.Source

object LongLines {

  // Method/Function
  def processFile(fileName: String, width: Int): Unit = {
    val source = Source.fromFile(fileName)
    for (line <- source.getLines)
      processLine(fileName, width, line)
  }

  private def processLine(fileName: String, width: Int, line: String): Unit = {
    if (line.length > width)
      println(fileName + ": " + line.length + ": " + line.trim)
  }


  def processFile2(fileName: String, width: Int): Unit = {
    // Local function
    def processLine(line: String): Unit = {
      if (line.length > width)
        println(fileName + ": " + line.length + ": " + line.trim)


    }

    def sum(a:Int, b:Int, c:Int) = a+b+c

    val a  =sum(_:Int, 3, _:Int)

    println(List(1, 2, 3, 4).reduce(a))

    val source = Source.fromFile(fileName)
    for (line <- source.getLines)
      processLine(line)
  }
}
