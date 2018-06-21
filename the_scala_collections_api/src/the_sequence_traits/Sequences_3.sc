val zs = Seq(3, 2, 5, 6, 1, 10)

// Reversals:
zs.reverse
val it = zs.reverseIterator
it.next()

/*
  A sequence obtained by mapping f over the
  elements of xs in reverse order.
 */
zs reverseMap (_ + 10)

// Comparisons:
zs startsWith Seq(3, 2)
zs startsWith Seq(3, 2, 3)
zs.startsWith(Seq(5, 6), 2)

zs endsWith Seq(1, 10)
zs contains 3
zs contains 11
zs containsSlice Seq(5, 6, 1)
zs containsSlice Seq(5, 1)

val xs = Seq(1, 2, 3, 4, 5, 6)
zs.corresponds(xs)((i: Int, i0: Int) => {
  println(i + " : " + i0)
  i+10 >= i0
})

(zs corresponds xs)(_ == _)

// Multiset operations:
/*
  The multi-set intersection of sequences xs and ys
  !! that preserves the order of elements in xs !!.
 */
zs intersect Seq(6, 5)
/*
  The multi-set difference of sequences xs and ys
  that preserves the order of elements in xs .
 */
zs diff Seq(6, 5)
zs union Seq(666) // == zs ++ Seq(666)

val ys = Seq(1, 1, 2, 3, 3, 4, 5, 6, 6, 6)
ys.distinct



