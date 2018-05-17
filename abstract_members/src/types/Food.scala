//package types

//class Food
//abstract class Animal[T <: Food] {
//  def eat(food: T)
//}
//class Grass extends Food
//class Cow extends Animal[Grass] {
//  override def eat(food: Grass) {} // This won’t compile,
//}
//// but if it did,...
//class Fish extends Food
//
//object A extends App {
//  val bessy: Animal[Grass] = new Cow
//  bessy eat (new Grass)
//}