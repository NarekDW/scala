def maxListUpBound[T <: Ordered[T]](elems: List[T]): T =
  elems match {
    case List() =>
      throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: rest =>
      val y = maxListUpBound(rest)
      if (x > y) x
      else y
  }

//maxListUpBound(List(1,5,10,3)) // Error - Int isn't inherits from Ordered

// Question - how to find f - function in standard library
def maxListImpParm[T](elems: List[T])(implicit f: T => Ordered[T])/*this an redundant code f - is never used explicitly*/: T =
  elems match {
    case List() =>
      throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: rest =>
      val y = maxListImpParm(rest)
      if (f(x) > y) x
      else y
  }

maxListImpParm(List(1,5,10,3))
maxListImpParm(List(1.5, 5.2, 10.7, 3.14159))
maxListImpParm(List("one", "two", "three"))

