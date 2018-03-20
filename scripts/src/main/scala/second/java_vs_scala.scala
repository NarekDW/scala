// Java style
def printArgs(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

// Scala style 1    <-----  Функция с побочным эффектом
def printArgs2(args: Array[String]): Unit = {
  for (arg <- args)
    println(arg)
}

// Scala style 2    <-----  Функция с побочным эффектом
def printArgs3(args: Array[String]): Unit = {
  args.foreach(println)
}


// Functional style
def formatArgs(args: Array[String]): String = args.mkString("\n")
val args = Array("one", "two", "three")
println(formatArgs(args))
assert(formatArgs(args) == "one\ntwo\nthree")