import scala.collection.mutable

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to Island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (2 -> "Find big XXX on ground.")
treasureMap += (3 -> "Dig.")
//println(treasureMap(2))
treasureMap.foreach(println)

val romanNumerals = Map(1 -> "I", 2 -> "II", (3).->("III") )
println(romanNumerals(3))