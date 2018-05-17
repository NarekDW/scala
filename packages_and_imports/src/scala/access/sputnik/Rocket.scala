package access.sputnik

class Rocket {

  import Rocket._

  private def canGoHome = fuel > 20
}

object Rocket {
  private val fuel = 10

  def chooseStrategy(rocket: Rocket): Unit = {
    if (rocket.canGoHome)
      some
    else
      another
  }

  def some = ???

  def another = ???


  protected def apply: Rocket = new Rocket()
}
