val i: Int = 3.5

implicit def doubleToInt(d: Double): Int = d.asInstanceOf[Int] // d.toInt

