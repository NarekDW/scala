val a = List(1, 2) ::: List(3, 4, 5)
val b = 1 :: 2 :: 3 :: List(4, 5)
val c = 1 :: 2 :: 3 :: 4 :: 5 :: Nil


// By hand

def append[T](xs: List[T], ys: List[T]): List[T] =
  xs match {
    case Nil => ys
    case x :: xs1 => x :: append(xs1, ys) // efficiency ~ xs.length
  }

append(List(1, 2, 3), List(4, 5, 6))