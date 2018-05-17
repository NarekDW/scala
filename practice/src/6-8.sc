// 6
val palindrome = isPalindrome(List(1, 2, 3, 2, 1))
println("is palindrome = " + palindrome)
assert(palindrome)
//def isPalindrome(ints: List[Int]): Boolean = ints == ints.reverse
def isPalindrome(ints: List[Int]): Boolean = ints match {
  case first :: (l :+ last) => if (first == last) isPalindrome(l) else false
  case _ :: Nil => true
}

val palindrome2 = isPalindrome(List(1, 1, 2, 3, 2, 1))
assert(!palindrome2)


// 7
val flattenList = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
// res0: List[Any] = List(1, 1, 2, 3, 5, 8)
println("flattenList = " + flattenList)
def flatten(list: List[Any]): List[Any] = list.flatMap {
  case innerList: List[_] => flatten(innerList)
  case value: Int => List(value)
}


// 8
val symbols = compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
println("symbols = " + symbols)
def compress(symbols: List[Symbol]): List[Symbol] = symbols match {
  case Nil => Nil
  case h :: tail => h :: compress(tail.dropWhile(_ == h))
}
// Tail recursion
val symbols2 = compressTailRecursive(
  List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e),
  Nil)
println("symbolsTailRecursion = " + symbols2)
def compressTailRecursive(symbols: List[Symbol], result: List[Symbol]): List[Symbol] =
  symbols match {
    case Nil => result
    case h :: tail => compressTailRecursive(tail.dropWhile(_ == h), result ::: List(h))
  }
// Functional
val symbols3 = compressFunctional(
  List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
println("symbolsFunctional = " + symbols3)
def compressFunctional(list: List[Symbol]): List[Symbol] =
  list.foldRight(List[Symbol]()) {
    (h, t) =>
      if (t.isEmpty || t.head != h) h :: t
      else t
  }
