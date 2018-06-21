import scala.collection.{LinearSeq, SortedSet, mutable}

Traversable(1, 2, 3)
Iterable("x", "y", "z")
Map(1 -> "x", 2 -> "y", 3 -> "z")
Set(1, 1, 2, 2, 3, 3)
SortedSet("world", "hello")
mutable.Buffer("x", "y", "z")
IndexedSeq("a", "b", "c")
LinearSeq("a", "b", "c")

List(1, 2, 3) map (_ + 1)
Set(1, 2, 3) map (_ * 2)
