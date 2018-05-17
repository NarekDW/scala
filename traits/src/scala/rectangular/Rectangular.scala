package rectangular

trait Rectangular {
  val s: Int = 3
  def topLeft: Point
  def bottomRight: Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}

class Point(val x:Int, val y:Int)

class Rectangle(val topLeft:Point, val bottomRight: Point, override val s:Int) extends Rectangular

object Main extends App {
  val rectangle = new Rectangle(new Point(3, 3), new Point(10, 0), 2)
  println(rectangle.s)
  println(rectangle.width)

}