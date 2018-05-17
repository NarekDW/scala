package abstracts

trait Abstract {
  /*
    One reason to use a type member is to define a short, descriptive alias
  for a type whose real name is more verbose, or less obvious in meaning, than
  the alias. Such type members can help clarify the code of a class or trait.
  The other main use of type members is to declare abstract types that must
  be defined in subclasses.
 */
  type T
  def transform(x: T): T

  /*
    You use an abstract val declaration in a class when you do not know the
  correct value in the class, but you do know that the variable will have an
  unchangeable value in each instance of the class.
    In other words, an abstract val constrains its legal implementation: any
  implementation must be a val definition; it may not be a var or a def .
   */
  val initial: T
  var current: T
}

class Concrete extends Abstract {
  override type T = String
  override def transform(x: T): T = ???
  override val initial: T = "hi"
  override var /*def*/ current: T = initial
}