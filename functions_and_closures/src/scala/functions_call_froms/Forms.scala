package functions_call_froms

object Forms {

  def main(args: Array[String]): Unit = {
    //    repeatable
    //    namedArguments
    defaultArguments
  }

  def repeatable: Unit = {
    def echo(args: String*) =
      for (arg <- args) println(arg)

    echo()
    echo("Hi")
    echo("Hi", "Doe")

    val array: Array[String] = Array("Hi", "Doe")
    //    echo(array) error
    echo(array: _*)

    def echo2(a1: String, a2: String) =
      println(a1 + a2)
    //    echo2(array: _*) error
  }

  def namedArguments: Unit = {
    def speed(distance: Float, time: Float) = distance / time

    println(speed(100, 10))
    println(speed(distance = 100, time = 10))
    println(speed(time = 10, distance = 100))
    //    println(speed(time = 10, 100)) error
  }

  def defaultArguments: Unit = {
    def printTo(out: java.io.PrintStream = Console.out, msg: String = "default empty") = out.println(msg)
    printTo()
    printTo(msg = "Hi")
    printTo(Console.err, "error")
  }

}
