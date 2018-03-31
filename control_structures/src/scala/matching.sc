val str = if (2 * 2 == 5) "some" else ""

str match {
  case "salt" => println("pepper")
  case "chips" => println("salsa")
  case "eggs" => println("bacon")
//  case 1 => ???
  case _ => println("wtf?")
}


val strRes = str match {
  case "salt" => "pepper"
  case "chips" => "salsa"
  case "eggs" => "bacon"
  //  case 1 => ???
  case _ => "wtf?"
}

println(strRes)


