package org.stairwaybook.layout

import Element.elem

abstract class Element {
  def contents: Array[String]
  def width: Int = contents(0).length
  def height: Int = contents.length

  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    elem(this1.contents ++ that1.contents)
  }
  def beside(that: Element): Element = {
    val this1 = this heighten that.height
    val that1 = that heighten this.height
    elem(
      for ((line1, line2) <- this1.contents zip that1.contents)
        yield line1 + line2)
  }
  def widen(w: Int): Element =
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right
    }
  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      var bot = elem(' ', width, h - height - top.height)
      top above this above bot
    }
  override def toString = contents mkString "\n"
}

object Element {

  private class ArrayElement(val contents: Array[String]) extends Element

  private class LineElement(str: String) extends Element {
    val contents: Array[String] = Array(str)
    override def width: Int = str.length
    override def height: Int = 1
  }

  private class UniformElement(
                                char: Char,
                                override val width: Int,
                                override val height: Int) extends Element {
    private val str: String = char.toString * width
    val contents: Array[String] = Array.fill(height)(str)
  }

  def elem(contents: Array[String]): Element = new ArrayElement(contents)

  def elem(char: Char, height: Int, width: Int): Element = new UniformElement(char, height, width)

  def elem(line: String): Element = new LineElement(line)

}