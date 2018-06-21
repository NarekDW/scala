// Upper bound
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

// View bound
// “ T < % Ordered[T] ” as saying, “I can use any T , so long
//as T can be treated as an Ordered[T] .”
def maxListViewBound[T <% Ordered[T]](elems: List[T]): T =
  elems match {
    case List() =>
      throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: rest =>
      val y = maxListViewBound(rest)
      if (x > y) x
      else y
  }

// Error
//maxListUpBound(List(1,5,10,3))
//maxListUpBound(List(1.5, 5.2, 10.7, 3.14159))
//maxListUpBound(List("one", "two", "three"))

// Fine
maxListViewBound(List(1,5,10,3))
maxListViewBound(List(1.5, 5.2, 10.7, 3.14159))
maxListViewBound(List("one", "two", "three"))
