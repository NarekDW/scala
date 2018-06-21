//class PreferredPrompt(val preference: String)(val x: Int)

//new PreferredPrompt("I'm your father Luke")_

class Person(var name : String, var age : Int, var email : String)
def mkPerson = (new Person(_, _, _)).curried
val p = mkPerson("John")(25)("mail")
p.name
p.age
p.email


class PreferredPrompt(val preference: String)
class PreferredDrink(val preference: String)
object Greeter {
  def greet(name: String)(implicit prompt: PreferredPrompt,
                          drink: PreferredDrink): Unit = {

    println("Welcome, "+ name +". The system is ready.")
    print("But while you work, ")
    println("why not enjoy a cup of "+ drink.preference +"?")
    println(prompt.preference)
  }
}

// But you can still provide the prompt explicitly, like this:
val bobsPrompt = new PreferredPrompt("relax> ")
val bobsDrink = new PreferredDrink("vodka ")
Greeter.greet("Bob")(bobsPrompt, bobsDrink)

object JoesPrefs {
  implicit val prompt = new PreferredPrompt("Yes, master> ")
  implicit val drink = new PreferredDrink("green tea")
}

//import JoesPrefs.prompt
//Greeter.greet("Joe") Error:(36, 81) could not find implicit value for parameter drink

import JoesPrefs._
Greeter.greet("Joe")

