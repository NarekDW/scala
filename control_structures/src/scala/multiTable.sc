import scala.collection.immutable

def printMultitable = {
  var i = 1
  while (i <= 10) {
    var j = 1
    while (j <= 10) {
      val prod = (i * j).toString
      var k = prod.length
      while (k < 4) {
        print(" ")
        k += 1
      }

      print(prod)
      j += 1
    }
    println
    i += 1
  }
}

printMultitable


val a = 1
val c = 3;
{
  val a = 2
  println(a)
  println(c)
}
println(a)