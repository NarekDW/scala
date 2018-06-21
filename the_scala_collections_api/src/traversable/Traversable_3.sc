val t = Traversable(1, 2, 3, 4, 5)

// Subdivisions:
t splitAt 3 // (List(1, 2, 3),List(4, 5))

/*
  Splits xs according to a predicate, giving the pair
  of collections (xs takeWhile p,
  xs.dropWhile p) .
 */
t span (_ < 3)

/*
  Splits xs into a pair of collections; one with
  elments that satisfy the predicate p , the other
  with elements that do not, giving the pair of
  collections (xs filter p, xs.filterNot p) .
 */
t partition (_%2 == 0) // (List(2, 4),List(1, 3, 5))

/*
  Partitions xs into a map of coll
 */
t groupBy (_ > 3) // Map(false -> List(1, 2, 3), true -> List(4, 5))


// Element conditions:
t forall (_ + 1 ==2)
t exists (_ == 3)
t count (_%2 == 0)


// Folds:
/*
  Applies binary operation op between successive
  elements of xs , going left to right, starting with z .
 */
(100 /: t) ((_, a: Int) => a)
t.foldLeft(100)((_, a: Int) => a)
t reduceLeft ((_, a: Int) => a)
/*
  Applies binary operation op between successive
  elements of xs , going right to left, starting with z .
 */
(t :\ 100) ((a: Int, _) => a)
t.foldRight(100)((a: Int, _) => a)
t reduceRight ((a: Int, _) => a)

