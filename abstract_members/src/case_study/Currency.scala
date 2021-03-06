package case_study

abstract class CurrencyZone{
  type Currency <: AbstractCurrency // abstract type
  def make(amount: Long): Currency // factory method

  val CurrencyUnit: Currency

  abstract class AbstractCurrency {
    val amount: Long
    def designation: String

    def +(that: Currency): Currency = make(this.amount + that.amount)
    def *(x: Double): Currency = make((this.amount * x).toLong)

    def from(other: CurrencyZone#AbstractCurrency): Currency =
      make(math.round(other.amount.toDouble * Converter.exchangeRate(other.designation)(this.designation)))

    override def toString: String =
      ((amount.toDouble / CurrencyUnit.amount.toDouble)
        formatted (" % ."+ decimals(CurrencyUnit.amount) +"f")
        +" "+ designation)

    private def decimals(n: Long): Int =
      if (n == 1) 0 else 1 + decimals(n / 10)
  }



}

object US extends CurrencyZone {
  abstract class Dollar extends AbstractCurrency {
    def designation = "USD"
  }

  type Currency = Dollar
  def make(cents: Long): Dollar = new Dollar {val amount: Long = cents}

  val Cent = make(1)
  val Dollar = make(100)
  val CurrencyUnit: Dollar = Dollar

}


object Europe extends CurrencyZone {
  abstract class Euro extends AbstractCurrency {
    def designation = "Euro"
  }

  override type Currency = Euro

  override def make(cents: Long): Euro = new Euro {
    override val amount: Long = cents
  }

  val Cent = make(1)
  val Euro = make(100)
  val CurrencyUnit = Euro
}


object Japan extends CurrencyZone {
  abstract class Yen extends AbstractCurrency {
    override def designation: String = "JPY"
  }

  override type Currency = Yen

  override def make(yen: Long): Yen = new Yen {
    override val amount: Long = yen
  }

  val Yen = make(1)
  val CurrencyUnit = Yen
}

