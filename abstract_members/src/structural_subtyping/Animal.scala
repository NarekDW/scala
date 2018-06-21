package structural_subtyping

import types.{Fish, Food, Grass}

trait Animal {
  type SuitableFood <: Food
  def eat(food: SuitableFood)
}

object Am extends App {

   val animals: List[Animal{type SuitableFood = Grass}] = Nil


  val a1 = new Animal {
    override def eat(food: SuitableFood): Unit = ???
    override type SuitableFood = Grass
  }

  val a2 = new Animal {
    override def eat(food: SuitableFood): Unit = ???
    override type SuitableFood = Fish
  }


  private val res: List[Animal {
  type SuitableFood = Grass }] = /* a2 :: - error*/ a1 :: animals


  res.foreach(println(_))
}
