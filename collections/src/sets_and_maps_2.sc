import scala.collection.mutable.TreeSet
import scala.collection.mutable.TreeMap

val ts = TreeSet(4, 5, 2, 3, 1)
ts += 0

val tm = TreeMap(3 -> 3, 2 -> 2, 5 -> 5, 1 -> 1)
tm += (4 -> 4)

tm(3)

// Immutable
val p = Set("Ann", "Jane")
//p += "Harry" error

var pe = Set("Ann", "Jane")
pe += "Harry"
pe



var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
capital
println(capital("France"))

val capital2 = scala.collection.mutable.Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
capital
println(capital("France"))


val mutableWithType = scala.collection.mutable.Set[Any](42)
mutableWithType += "asdasd"


//
val l = List("a", "b", "c")
val tr = scala.collection.immutable.TreeSet[String]("z","d")
tr ++ l

tr.toList
tr.toArray