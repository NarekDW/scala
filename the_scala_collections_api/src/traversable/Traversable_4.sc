val t = Traversable(1, 2, 3, 4, 5)

// Specific folds:
t.sum
t.product
t.max
t.min

// Strings:
val b = new StringBuilder
t addString (b, "start ", ":", " end")
t.mkString
t mkString ("start ", ":", " end")
/*
  The collection name at the beginning of the string
  returned from xs.toString .
 */
t.stringPrefix // List


// Views:
/*
  View produces a lazy collection
 */
t.view
//(1 to 1000000000).filter(_ % 2 == 0).take(10).toList
// java.lang.OutOfMemoryError: GC overhead limit exceeded

val a = (1 to 1000000000).view.filter(_ % 2 == 0).take(10).toList
a

t view (2, 4) toList
