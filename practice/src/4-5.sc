// 4
val lengthInt = length(List(1, 1, 2, 3, 5, 8, 11, 12))
assert(lengthInt == 8)
//def length(list: List[Int]): Int = list.length
def length(list: List[Int]): Int = list match {
  case Nil => 0
  case _ :: tail => 1 + length(tail)
  case _ => throw new RuntimeException
}


// 5
val reverseInts = reverse(List(1, 1, 2, 3, 5, 8)) // res0: List[Int] = List(8, 5, 3, 2, 1, 1)
println("reverseInts = " + reverseInts)
//def reverse(list: List[Int]) = list.reverse
def reverse(list: List[Int]): List[Int] = list match {
  case Nil => Nil
  case h::tail => reverse(tail) ::: List(h)
  case _ => throw new RuntimeException
}

val reverseInts2 = reverse2(List(1, 1, 2, 3, 5, 8), Nil)
println("reverseInts2 = " + reverseInts2)
def reverse2(list: List[Int], rest:List[Int]): List[Int] = list match {
  case Nil => rest
  case h::tail => reverse2(tail, h :: rest)
  case _ => throw new RuntimeException
}
