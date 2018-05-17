package vals

trait RationalTrait {
  val numerArg: Int
  val denomArg: Int
  require(denomArg != 0) // Error
}

class RationalTraitImpl extends RationalTrait {
  override val numerArg: Int = 1
  override val denomArg: Int = 2
}

object A extends App {

  new RationalTraitImpl // Error

  val rat = new RationalTrait { // Error
    override val denomArg: Int = 1
    override val numerArg: Int = 1
  }

  print("Done")
}