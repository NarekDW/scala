package scala.trait_app

import ChecksumAccumulator.calculate

object FallWinterSpring extends App {

  for (season <- List("falls", "winter", "spring"))
    println(season + ": " + calculate(season))

  private val symbol: Symbol = 'ident


  updateRecordByName('updateByThisKey, "Ok computer")

  def updateRecordByName(r: Symbol, value: Any) = {
    // code here
    println(r.name)
    println(r)
  }
}
