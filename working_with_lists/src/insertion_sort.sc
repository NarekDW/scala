def isort(list: List[Int]): List[Int] =
  if (list.isEmpty) Nil
  else insert(list.head, isort(list.tail))

def insert(x: Int, xs: List[Int]): List[Int] =
  if (xs.isEmpty || x <= xs.head) x :: xs
  else xs.head :: insert(x, xs.tail)

isort(List(3, 4, 2, 1, 7, 8, 11))


// with pattern matching
def isortPM(list: List[Int]): List[Int] =
  list match {
    case Nil => Nil
    case h :: tail => insertPM(h, isortPM(tail))
  }

def insertPM(x: Int, xs: List[Int]): List[Int] =
  xs match {
    case Nil => x :: Nil
    case y :: ys =>
      if (x > y)
        y :: insertPM(x, ys)
      else x :: xs
  }

val pm = isortPM(List(3, 4, 2, 1, 7, 8, 11))