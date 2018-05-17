val list = List.range(1, 11)

rev(list)
reverseLeft(list)
reverseRight(list)

// 1 ~ O(n^2)
def rev[T](xs: List[T]): List[T] =
  xs match {
    case Nil => Nil
    case h :: tail => rev(tail) ::: List(h)
  }

// 2 ~ O(n)
def reverseLeft[T](xs: List[T]) =
  (List[T]() /: xs) ((ys: List[T], y: T) => y :: ys)

// 3 ~ O(n^2)
def reverseRight[T](xs: List[T]) =
  (xs :\ List[T]()) ((y: T, ys: List[T]) => ys ::: List(y))