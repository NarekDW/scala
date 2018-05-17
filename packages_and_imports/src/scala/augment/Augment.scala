package bobsrockets
package navigation {

  private[bobsrockets] class Navigator {
    protected[navigation] def useStarChart() {}

    protected[Navigator] class LegOfJourney {
      private[Navigator] val distance = 100
    }

    private[this] var speed = 200
  }

  class A extends Navigator {
    useStarChart()
    new LegOfJourney
  }

  class B {
//    new LegOfJourney
//    new Navigator/
  }
}

package launch {

  import navigation._

  object Vehicle {
    private[launch] val guide = new Navigator
//    guide.use
  }

}