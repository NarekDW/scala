package control_struct

import java.io.{File, PrintWriter}

object NewControl {

  def main(args: Array[String]): Unit = {
    val file = new File("/home/narek/IdeaProjects/scala-professional-programming/test.txt")
    writeWith(file, writer => writer.write("SOME TEXT"))
    // Currying
    writeWith2(file) {
      writer => writer.println("SOME TEXT SCALA")
    }
  }

  def writeWith(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  def writeWith2(file: File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

}