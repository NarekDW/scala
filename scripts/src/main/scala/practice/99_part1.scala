// 1
val lastInt = last(List(1, 1, 2, 3, 5, 8))
println("lastInt = " + lastInt)
def last(list: List[Int]): Int = list.last

// 2
val penultimateInt = penultimate(List(1, 1, 2, 3, 5, 8))
println("penultimateInt = " + penultimateInt)
def penultimate(list: List[Int]): Int = list(list.length - 2)

// 3
val nthInt = nth(2, List(1, 1, 2, 3, 5, 8)) // 2
println("nthInt = " + nthInt)
def nth(pos: Int, list: List[Int]): Int = list(pos)

// 4
val lengthInt = length(List(1, 1, 2, 3, 5, 8)) // 6
println("lengthInt = " + lengthInt)
def length(list: List[Int]): Int = list.length

// 5
val reverseInts = reverse(List(1, 1, 2, 3, 5, 8)) // res0: List[Int] = List(8, 5, 3, 2, 1, 1)
println("reverseInts = " + reverseInts)
def reverse(list: List[Int]) = list.reverse

// 6
val palindrome = isPalindrome(List(1, 2, 3, 2, 1)) // res0: Boolean = true
println("is palindrome = " + palindrome)
def isPalindrome(ints: List[Int]): Boolean = ints == ints.reverse

// 7
val flattenList = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
// res0: List[Any] = List(1, 1, 2, 3, 5, 8)
println("flattenList = " + flattenList)
def flatten(list: List[Any]): List[Any] = list.flatMap {
  case innerList: List[_] => flatten(innerList)
  case value: Int => List(value)
}

// 8
//val symbols = compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//println("symbols = " + symbols)
//res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
//def compress(symbols: List[Symbol]):List[Symbol] = symbols.distinct
//def compress(symbols: List[Symbol]): List[Symbol] = symbols.foldRight()

