val t = Traversable(1, 2, 3, 4, 5)

// Size info:
t.isEmpty
t.nonEmpty
t.size
t.hasDefiniteSize

Stream(1, 2, 3).hasDefiniteSize


// Element retrieval:
t.head
t.headOption
t.last
t.lastOption
t.find(_ > 2)
t.find(_ > 7)


// Subcollections:
t.tail
t.init
t slice (2, 4)  // (from, to) (from from , up to and excluding to )

t take 3
t drop 3 // The rest of the collection except xs take n .

val tw = t takeWhile (_ <= 3)
val dw = t dropWhile (_ <= 3)

val filter = t filter (_%2 == 0)
/*
  A non-strict filter of this collection. All
  operations on the resulting filter will only apply
  to those elements of xs for which the condition p
  is true.
 */
t withFilter (_%2 == 0) // scala.collection.generic.FilterMonadic[Int,Traversable[Int]]

val filterNot = t filterNot (_%2 == 0)
