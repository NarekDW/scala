val xs = Seq(1, 3, 5, 7, 9)

// Additions:
11 +: xs
xs :+ 11
/*
  The sequence resulting from appending the value
  x to xs until length len is reached.
 */
xs padTo (10, 777)


// Updates:
/*
  The sequence resulting from replacing r elements
  of xs starting with i by the patch ys .
  1 - start index
  Seq(...) - patch to insert/replace
  3 - amount of replaced elements
 */
xs patch(1, Seq(777, 666), 3)

xs updated (1, 777)
//xs(1) = 777

import scala.collection.mutable

/*
  Note the difference between update and updated . The update method changes
  a sequence element in place, and is only available for mutable sequences.
  The updated method is available for all sequences and always returns a new
  sequence instead of modifying the original.
 */
val ms = mutable.Seq(1, 2, 3, 4, 5)
ms(1) = 111
ms
ms.update(1, 112)
ms
ms.updated(1, 113)
ms


// Sorting:
val zs = Seq(3, 2, 5, 6, 1, 10)
zs.sorted
zs.sortWith (_ > _)
zs.sortBy (-_)
