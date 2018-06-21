import scala.collection.mutable

val buf = mutable.Buffer(1, 2, 3)

// Additions:
buf += 4
buf += (5, 6, 7)

buf ++= mutable.Buffer(8, 9, 10)

0 +=: buf
mutable.Buffer(-2, -1) ++=: buf

buf insert (1, 666)
buf
buf insertAll (2, mutable.Buffer(555, 444))
buf

// Removals:
buf -= 666
buf remove 1
buf remove (0, 5)
buf

buf trimStart 3
buf
buf trimEnd 3
buf
buf.clear()
buf


// Cloning:
val b = mutable.Buffer(1, 2, 3, 4)
val b2 = b.clone()

