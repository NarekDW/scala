package `var`

trait AbstractTime {
  var hour: Int
  var minute: Int
}

// Одно и то же
trait AbstractTimeSame {
  def hour: Int // getter for ‘hour’
  def hour_=(x: Int) // setter for ‘hour’
  def minute: Int // getter for ‘minute’
  def minute_=(x: Int) // setter for ‘minute’
}
