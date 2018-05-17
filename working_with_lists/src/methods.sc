val list = List(1, 2, 3, 4, 5)

list.last // O(n)
list.init // O(n)

list.reverse
// reverse by hand
def rev[T](xs: List[T]): List[T] =
  xs match {
    case Nil => Nil
    case h :: tail => rev(tail) ::: List(h)
  }

rev(list)

list.take(2)
list.drop(2)
list.splitAt(2) // equals (list.take(2), list.drop(2))

list(3) // O(n) rare with List
list apply 3

list.indices // Range of indexes

val f = List(list, list)
f.flatten

val abcde = List("a", "b", "c", "d", "e")
val zp = abcde.indices zip abcde

val zpwthind = abcde.zipWithIndex

val unziped = zp.unzip


val str = abcde.toString()
val mkstr = abcde.mkString("start ", " __ ", " end")

val buf = new StringBuilder
val builder = abcde addString  (buf, "[", ", ", "]")

val arr = abcde.toArray
val list2 = arr.toList

val arr2 = new Array[Int](10)
list copyToArray(arr2, 3)
arr2


val it = list.iterator
it.next()
it.next()
it.next()
it.next()


