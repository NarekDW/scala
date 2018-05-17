class Que private(val s: String, a: String, private val d: String) {

}

object Que {
  val que = new Que("some", "aaa", "ddd")
  que.s
//  que.a // Not accessible
  que.d // Accessible only from companion object
}