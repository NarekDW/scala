package types

class Food
abstract class Animal {
  type SuitableFood <: Food
  def eat(food: SuitableFood)
}

class Grass extends Food
class Cow extends Animal {
  type SuitableFood = Grass
  override def eat(food: Grass) {}
}

class Fish extends Food

object A extends App {
  val bessy: Animal = new Cow
//  bessy eat new Fish
  bessy eat new bessy.SuitableFood
}


class DogFood extends Food
class Dog extends Animal {
  type SuitableFood = DogFood
  override def eat(food: DogFood) {}
}

class Outer {

  private val s = 1

  class Inner {
    private val g = 2
    val ss = s
    this.ss
  }
}

object B extends App {
  val lassie = new Dog
  val bootsie = new Dog
  lassie eat (new bootsie.SuitableFood)

//  val i = new Outer#Inner

  val o1 = new Outer
  val o2 = new Outer

  val inner = new o1.Inner
//  o1.Inner
}

