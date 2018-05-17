Set(1, 2, 3)

//type MutSet[A] = scala.collection.mutable.Set[A]
val MutSet = scala.collection.mutable.Set
MutSet(1, 2, 3)

// Set
val text = "See Spot run. Run, Spot. Run!"
val words = text.split("[.,! ]+")

val set = scala.collection.mutable.Set.empty[String]

for (w <- words)
  set += w.toLowerCase

set

val ints = scala.collection.mutable.Set.empty[Int]

ints + 5
ints += 5

ints ++ List(1, 2)

val nums = Set(1, 2, 3)
nums & Set(1, 2, 7, 10)


val strs = scala.collection.mutable.Set.empty[String]

strs += "the"
strs ++= List("some")

val strs2 = Set.empty[String]

strs2 + "the"
strs2 ++ List("some")

// Map
import scala.collection.mutable

val mutMap = mutable.Map.empty[String, Int]
//mutMap("hello") = 1
//mutMap("world") = 22

val map = mutable.Map.empty[String, Int]
map + ("hello" -> 1)

val tuple = "iii" -> 3

