val xs = Seq(1, 3, 5, 7, 9)

// Indexing and length:
xs(0)
xs(3)

// Tests whether i is contained in xs.indices .
xs isDefinedAt 3
xs isDefinedAt 7

xs.length

val ys = Seq(1, 3, 5, 7, 9, 11, 13, 15)
/*
  Returns -1 if xs is shorter than ys , +1 if it is
  longer, and 0 is they have the same length. Works
  even if one if the sequences is infinite.
 */
xs lengthCompare ys.length

xs.indices


// Index search:
xs indexOf 7
xs lastIndexOf 7

val s = Seq(5, 7)
xs indexOfSlice s
xs lastIndexOfSlice s

xs indexWhere (_ == 7)
xs lastIndexWhere (_ == 7)

/*
  The length of the longest uninterrupted segment
  of elements in xs , starting with xs(i) , that all
  satisfy the predicate p .
 */
xs segmentLength (_ >= 5, 2)

xs prefixLength (_ < 7) // == segmentLength(p, 0)


