def msort[T](less: (T, T) => Boolean)(xs: List[T]): List[T] = {

  def merge(xs: List[T], ys: List[T]): List[T] =
    (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (less(x, y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }

  val n = xs.length / 2
  if (n == 0) xs
  else {
    val (ys, zs) = xs splitAt n
    merge(msort(less)(ys), msort(less)(zs))
  }
}

val abcde = List('a', 'b', 'c', 'd', 'e')
msort((v1: Char, v2: Char) => v1 > v2)(abcde) // norm
//msort(_ > _)(abcde) // Type mismatch
msort[Char](_ > _)(abcde) // norm
msort2(abcde)(_ > _) // norm

def msort2[T](xs: List[T])(less: (T, T) => Boolean): List[T] = {

  def merge2(xs: List[T], ys: List[T]): List[T] =
    (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (less(x, y)) x :: merge2(xs1, ys)
        else y :: merge2(xs, ys1)
    }

  val n = xs.length / 2
  if (n == 0) xs
  else {
    val (ys, zs) = xs splitAt n
    merge2(msort2(ys)(less), msort2(zs)(less))
  }
}
