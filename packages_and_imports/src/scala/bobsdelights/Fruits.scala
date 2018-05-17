package bobsdelights

object Fruits {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("orange", "orange")
  val menu = List(Apple, Orange)
}