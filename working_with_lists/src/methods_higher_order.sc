List(1, 2, 3) map (_ + 1)

val words = List("the", "quick", "brown", "fox")

val m = words map (_.toList)
val fm = words flatMap (_.toList)

List.range(/*including*/ 1, /*excluding*/ 5)
val tuples1 = List.range(1, 5) flatMap (
  i => List.range(1, i) map (j => (i, j))
  )

val tuples2 = for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)

var sum = 0
List.range(1, 11) foreach (sum += _)
sum

// filter
val f = List.range(1, 7) filter (_ % 2 == 0)
val three = words filter (_.length == 3)

// partition
val prtn = List.range(1, 7) partition (_ % 2 == 0)

// find
val fnd = List.range(1, 7) find (_ % 2 == 0)
val fnd2 = List.range(1, 7) find (_ % 2 == 33)

// takeWhile dropWhile
val tw = List.range(1, 7) takeWhile (_ < 4)
val dw = List.range(1, 7) dropWhile (_ < 4)
// span
val spn = List.range(1, 7) span (_ < 4)


// take drop
val tk = List.range(1, 7) take (3)
val dr = List.range(1, 7) drop (3)
// splitAt
val spt = List.range(1, 7) splitAt (3)

// forall exist
val frall = List.range(1, 7) forall (_ > 3)
val exst = List.range(1, 7) exists (_ > 3)

val s = sum(List.range(1, 5))
def sum(xs: List[Int]) = (0 /: xs) (_ + _)
val p = product(List.range(1, 5))
def product(xs: List[Int]) = (1 /: xs) (_ * _)

val foldLeft = (words.head /: words.tail) (_ + " " + _)
val foldRight = (words.init :\ words.last) (_ + " " + _)

// efficiency
val list = List(List(1, 2, 3), List(4, 5, 6))
val lft = flattenLeft(list)
def flattenLeft[T](xs: List[List[T]]) = (List[T]() /: xs) (_ ::: _)
val rght = flattenRight(list)
def flattenRight[T](xs: List[List[T]]) = (xs :\ List[T]()) (_ ::: _)

// sortWith
val srt = List(-1, 10, -3, 2, -22)
srt sortWith (_ < _)
srt sortWith (_ > _)
srt sortWith ((t1: Int, t2: Int) => t1 > 0)

List("aa", "aaa", "a", "b", "cc", "c")
  .sortBy((str: String) => (str.head, str.length))