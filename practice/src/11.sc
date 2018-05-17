// 11
encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
def encodeModified(symbols: List[Symbol]): List[Any] =
  symbols match {
    case Nil => Nil
    case h :: tail =>
      val i = tail.takeWhile(_ == h).size + 1
      if (i != 1)
        List((i, h)) ::: encodeModified(tail.dropWhile(_ == h))
      else
        List(h) ::: encodeModified(tail.dropWhile(_ == h))
  }

// 12
