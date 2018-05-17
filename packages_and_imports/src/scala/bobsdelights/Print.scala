package bobsdelights

import bobsdelights.Fruits._

object Print {

  def main(args: Array[String]): Unit = {
    for (m <- menu)
      show(m)
  }
}
