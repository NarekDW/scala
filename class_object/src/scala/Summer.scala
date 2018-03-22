package scala

object Summer {

  import ChecksumAccumulator.calculate

  def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }

}
