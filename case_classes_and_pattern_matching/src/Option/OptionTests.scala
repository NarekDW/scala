package Option

import simple.{BinOp, Number}

object OptionTests extends App {

  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo", Some("sa") -> "s")
  println(capitals get "France") // Some(Paris)
  println(capitals get "Another") // None
  println()
  println(show(capitals get "France")) // Paris
  println(show(capitals get "Another")) // ?

  def show(option: Option[String]) = option match {
    case Some(x) => x
    case None => "?"
  }

  //  m("Another")   // java.util.NoSuchElementException: key not found: Another

  println()

  val exp = new BinOp("*", Number(5), Number(1))
  val b@BinOp(op, left, right) = exp
  println(b.left)
  println(b.right)

  val t = (12, "str")
  val e@(_, _) = t
  println(e._1)
  println(e._2)

  println()
  val withDefault: Option[String] => String = {
    case Some(s) => s
    case None => "none"
  }
  println(withDefault(Some("12")))
  println(withDefault(None))


  val second: List[Int] => Int = {
    case a :: b :: _ => b
  }

  println(second(List(1, 2, 3)))
  println(second(List(1, 2)))
  //  println(second(List(1))) // scala.MatchError: List(1)


  val second2: PartialFunction[List[Int], Int] = {
    case a :: b :: _ => b
  }
  println()
  println(second2.isDefinedAt(List(1, 2))) // true
  println(second2.isDefinedAt(List(1))) // false

  val second3: Function1[List[Int], Int] = {
    case a :: b :: _ => b
  }


  println("\n\npatterns in for loop")
  // patterns in for loop
  for ((country, capital) <- capitals)
    println(country + " : " + capital)

  println()
  val fruits = List(Some("Apple"), None, Some("Orange"))
  for (Some(fruit) <- fruits)
    println(fruit)
}
