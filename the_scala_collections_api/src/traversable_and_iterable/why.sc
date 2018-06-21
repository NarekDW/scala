// So the total number of steps to traverse the tree is N + N - 1 .
//sealed abstract class Tree2 extends Traversable[Int] {
//  def foreach[U](f: Int => U) = this match {
//    case Node(elem) => f(elem)
//    case Branch(l, r) => l foreach f; r foreach f
//  }
//}

// N log(N)
sealed abstract class Tree extends Iterable[Int] {
  override def iterator: Iterator[Int] = this match {
    case Node(elem) => Iterator.single(elem)
    case Branch(l, r) => l.iterator ++ r.iterator
  }
}

case class Branch(left: Branch, right: Branch) extends Tree
case class Node(elem: Int) extends Tree


val s = Seq(3, 5, 1)(1)