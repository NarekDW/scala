val account = new BankAccount
account deposit 100
account withdraw 80
account withdraw 80

val time = new Time
time.hour_=(222)
time.hour = 333
time.hour
time.minute


class Time {
  var hour = 12
  var minute: Int = _
}

class Time2 {
  private var h = 0
  private var m = 0

  def hour = h

  def hour_=(x: Int) = {
    require(0 <= x && x < 24)
    h = x
  }

  def minute = m

  def minute_=(x: Int) = {
    require(0 <= x && x < 60)
    m = x
  }
}


class Thermometer {
  var celsius: Float = _

  def fahrenheit: Float = celsius * 9 / 5 + 32

  def fahrenheit_=(x: Float) = celsius = (x - 32) * 5 / 9

  override def toString: String = fahrenheit + "F/" + celsius + "C"
}


val t = new Thermometer
t.celsius = 100
t
t.fahrenheit = 33
t
