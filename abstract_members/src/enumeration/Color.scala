package enumeration

object Color extends Enumeration {
  val Red, Blue, Green = Value
}

object Direction extends Enumeration {
  val East = Value("East")
  val North = Value("North")
  val South = Value("South")
  val West = Value("West")
}

object CD extends App {
  for(i <- Direction.values) println(i)
}