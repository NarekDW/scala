package parametric_fields

class Cat {
  val dangerous = false
}

class Dog( a: Int,
           override val dangerous: Boolean,
           private var age: Int
         ) extends Cat {

}