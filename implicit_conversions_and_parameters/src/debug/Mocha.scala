package debug

object Mocha extends App {
  class PreferredDrink(val preference: String)
  implicit val pref: PreferredDrink = new PreferredDrink("mocha")
  def enjoy(name: String)(implicit drink: PreferredDrink) {
    print("Welcome, "+ name)
    print(". Enjoy a ")
    print(drink.preference)
    println("!")
  }
  enjoy("reader")
}

// scala -Xprint:typer - to get an interactive shell that prints out the post-typing source code it uses internally
// scalac -Xprint:typer implicit_conversions_and_parameters/src/debug/Mocha.scala

/*

[[syntax trees at end of                     typer]] // Mocha.scala
package debug {
  object Mocha extends AnyRef with App {
    def <init>(): debug.Mocha.type = {
      Mocha.super.<init>();
      ()
    };
    class PreferredDrink extends scala.AnyRef {
      <paramaccessor> private[this] val preference: String = _;
      <stable> <accessor> <paramaccessor> def preference: String = PreferredDrink.this.preference;
      def <init>(preference: String): debug.Mocha.PreferredDrink = {
        PreferredDrink.super.<init>();
        ()
      }
    };
    private[this] val pref: debug.Mocha.PreferredDrink = new Mocha.this.PreferredDrink("mocha");
    implicit <stable> <accessor> def pref: debug.Mocha.PreferredDrink = Mocha.this.pref;
    def enjoy(name: String)(implicit drink: debug.Mocha.PreferredDrink): Unit = {
      scala.this.Predef.print("Welcome, ".+(name));
      scala.this.Predef.print(". Enjoy a ");
      scala.this.Predef.print(drink.preference);
      scala.this.Predef.println("!")
    };
    Mocha.this.enjoy("reader")(Mocha.this.pref) <----------- YOU CAN SEE HERE AN IMPLICIT CONVERSION
  }
}

 */