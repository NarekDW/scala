println("------------------------ args.foreach((arg: String) => println(arg))")
args.foreach((arg: String) => println(arg))
println("------------------------ args.foreach(arg => println(arg))")
args.foreach(arg => println(arg))
println("------------------------ args.foreach(println)")
args.foreach(println)
println("------------------------ for (arg <- args)")
for (arg <- args) println(arg)