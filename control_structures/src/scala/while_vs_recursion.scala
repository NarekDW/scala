def greatestCommonDivisor(x: Long, y: Long) = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

def gcd(x: Long, y: Long): Long = if (y == 0) x else gcd(y, x % y)


def fibonLoop(int: Int) {
  var a = 1
  var b = 1
  var c = 0
  for (i <- int) {
    c = a + b
    a = b
    b = c
  }
  c
}

def fibon(int: Int): Int = if (int <= 2) 1 else fibon(int - 1) + fibon(int - 2)