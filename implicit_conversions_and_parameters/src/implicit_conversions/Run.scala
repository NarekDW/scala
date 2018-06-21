package implicit_conversions

import java.awt.event.{ActionEvent, ActionListener}

import javax.swing.JButton

object Run extends App {

  implicit def function2ActionListener(f: ActionEvent => Unit) = {
    println("function2ActionListener")
    new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit = f(e)
    }
  }

  val button = new JButton
  button.addActionListener((_: ActionEvent) => println("pressed!"))


  implicit def d2i(d: Double) : Int = {
    println("Implicit conversion performed")
    d.asInstanceOf[Int]
  }

//  implicit def d2iAnotherFunction(d: Double) : Int = d.asInstanceOf[Int] Error


  val s = new Substitution
  s add 2.3
}


class Substitution {
  def add(i: Int) = println(i)
}