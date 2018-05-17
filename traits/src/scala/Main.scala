object Main extends App {

  val frog = new Frog
  println(frog)

  frog.philosophize()

  val phil: Philosophical = frog
  phil.philosophize()
}
