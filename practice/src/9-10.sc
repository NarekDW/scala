// 9
val symbolsSource = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
val packRes = pack(symbolsSource)
//res0: List[List[Symbol]] = List(
//  List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a),
//  List('d), List('e, 'e, 'e, 'e))
packRes.foreach(println(_))
def pack(symbols: List[Symbol]): List[List[Symbol]] = symbols match {
  case Nil => Nil
  case h :: tail => List(h :: tail.takeWhile(_ == h)) :::
    pack(tail.dropWhile(_ == h))
}
println("TailRecursive")
val packResTailRec = packTailRecursive(symbolsSource, Nil)
packResTailRec.foreach(println(_))
def packTailRecursive(symbols: List[Symbol], result: List[List[Symbol]]): List[List[Symbol]] =
  symbols match {
    case Nil => result
    case h :: tail => packTailRecursive(tail.dropWhile(_ == h),
      result ::: List(h :: tail.takeWhile(_ == h)))
  }


// 10
val encodeRes = encode(symbolsSource)
//res0: List[(Int, Symbol)] =
// List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
println("encodeRes")
encodeRes.foreach(println(_))
def encode(symbols: List[Symbol]): List[(Int, Symbol)] = symbols match {
  case Nil => Nil
  case h :: tail => List((tail.takeWhile(_ == h).size + 1, h)) :::
    encode(tail.dropWhile(_ == h))
}
println("TailRecursive")
val encodeResTailRec = encodeTailRecursive(symbolsSource, Nil)
encodeResTailRec.foreach(println(_))
def encodeTailRecursive(symbols: List[Symbol], result: List[(Int, Symbol)]): List[(Int, Symbol)] =
  symbols match {
    case Nil => result
    case h :: tail => encodeTailRecursive(
      tail.dropWhile(_ == h),
      result ::: List((tail.takeWhile(_ == h).size + 1, h))
    )
  }

