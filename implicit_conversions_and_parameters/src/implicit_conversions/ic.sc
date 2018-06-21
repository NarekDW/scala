import java.awt.event.{ActionEvent, ActionListener}

import javax.swing.JButton

val button = new JButton
button.addActionListener(
  new ActionListener {
    def actionPerformed(event: ActionEvent) {
      println("pressed!")
    }
  }
)

object Dollar {
  implicit def dollarToEuro(x: Dollar): Euro = {
    println("In Dollar")
    new Euro
  }
}

class Dollar
class Euro {
  def a(e: Euro): Int = 213
}

implicit def dollarToEuro(x: Dollar): Euro = {
  println("In File")
  new Euro
}

val d = new Dollar
val e = new Euro

e a d
d a e