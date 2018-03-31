package tail_recursion

object TailRec {

  def main(args: Array[String]): Unit = {
    def notTailRec(x: Int): Int =
      if (x == 0) throw new Exception("notTailRec!")
      else notTailRec(x - 1) + 1

    /*
    Recursion because not tail-recursion function
    Exception in thread "main" java.lang.Exception: notTailRec!
            at tail_recursion.TailRec$.notTailRec$1(TailRec.scala:7)
            at tail_recursion.TailRec$.notTailRec$1(TailRec.scala:8)
            at tail_recursion.TailRec$.notTailRec$1(TailRec.scala:8)
            at tail_recursion.TailRec$.notTailRec$1(TailRec.scala:8)
            at tail_recursion.TailRec$.main(TailRec.scala:10)
            at tail_recursion.TailRec.main(TailRec.scala)

     */
//    notTailRec(3)

    def tailRec(x: Int): Int =
      if (x == 0) throw new Exception("notTailRec!")
      else tailRec(x - 1)


    /*
    Not recursion because tail-recursion function
    Exception in thread "main" java.lang.Exception: notTailRec!
      	at tail_recursion.TailRec$.tailRec$1(TailRec.scala:13)
	      at tail_recursion.TailRec$.main(TailRec.scala:16)
	      at tail_recursion.TailRec.main(TailRec.scala)
     */
    tailRec(3)

  }

}
