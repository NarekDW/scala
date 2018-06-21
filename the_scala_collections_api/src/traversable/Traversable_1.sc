import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

val t = Traversable(1, 2, 3, 4, 5)

// Abstract method:
t foreach (println(_))

// Addition:
t ++ Traversable(6, 7, 8)

// Maps:
t map (_ + 10)
t flatMap (s => List(s, s))
//t collect {case s: String => s + " collected"}


// Conversions:
t.toArray
t.toList
t.toIterable
t.toSeq
t.toIndexedSeq
t.toStream // a lazily computed sequence
t.toSet
t map (_ -> 1) toMap

// Copying:
val a: mutable.Buffer[Int] = ArrayBuffer()
t copyToBuffer a
a

val arr: Array[Int] = new Array(10)
t copyToArray(arr, 2, 3)
arr
