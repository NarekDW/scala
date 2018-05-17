package object bobsdelights {
  def show(fruit: Fruit) = {
    import fruit._
    println(name+" : "+color)
  }

  def app = {
    m((i: Int, i0: Int) => i+i0)
    m((i: Int, i0: Int, i1: Int) => (i, i0) => i)
  }

  def m(f: (Int, Int) => Int) = {}
  def m(f: (Int, Int, Int) => (Int, Int) => Int) = {}
}