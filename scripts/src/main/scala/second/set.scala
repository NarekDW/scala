val immutSet = Set("A", "B")
val immutSet2 = immutSet + "C"

import scala.Console.println
import scala.collection.mutable

val mutSet = mutable.Set(1, 2, 3)
mutSet += 4
println("mutable set = " + mutSet)

import scala.collection.immutable.HashSet

val hashSet = HashSet(1, 2, 3)
println("immutable hashset = " + hashSet + " : " + (hashSet + 4))
