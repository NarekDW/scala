// 1
val lastInt = last(List(1, 1, 2, 3, 5, 8))
assert(lastInt == 8)
//def last(list: List[Int]): Int = list.last
def last(list: List[Int]): Int = list match {
  case h :: Nil => h
  case _ :: tail => last(tail)
  case _ => throw new RuntimeException
}


// 2
val penultimateInt = penultimate3(List(1, 1, 2, 3, 5, 8))
assert(penultimateInt == 5)
//def penultimate(list: List[Int]): Int = list(list.length - 2)
def penultimate2(list: List[Int]): Int =
  if (list.isEmpty) throw new RuntimeException
  else list.init.last
def penultimate3(list: List[Int]): Int = list match {
  case h :: _ :: Nil => h
  case _ :: tail => penultimate3(tail)
  case _ => throw new RuntimeException
}


// 3
val nthInt = nth(3, List(1, 1, 2, 3, 5, 8)) // 2
println("nthInt = " + nthInt)
assert(nthInt == 3)
//def nth(pos: Int, list: List[Int]): Int = list(pos)
def nth(pos: Int, list: List[Int]): Int = (pos, list) match {
  case (0, h :: _) => h
  case (n, _ :: tail) => nth(n - 1, tail)
  case _ => throw new RuntimeException
}