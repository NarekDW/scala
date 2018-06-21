package case_study

object Runner extends App {

  val yen = Japan.Yen from US.Dollar * 100
  println(yen)

//  Japan.Yen + US.Dollar
  Japan.Yen + Japan.Yen

}
