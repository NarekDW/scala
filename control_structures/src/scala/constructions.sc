import java.io.FileReader

for {
  i <- List(List(1, 2, 3), List(4, 5, 6))
  a <- i
} println(a)

for {
  i <- List(List(1, 2, 3), List(4, 5, 6))
  l = i(0)
  a <- i
} println(a + ": " + l)


val ints: List[Int] = for {
  i <- List(List(1, 2, 3), List(4, 5, 6))
  a <- i
} yield a

println(ints)

val ints2: Array[Int] = for {
  i <- Array(Array(1, 2, 3), Array(4, 5, 6))
  a <- i
} yield a

println(ints2)

val ints3: Array[Int] = for {
  i <- Array(Array(1, 2, 3), Array(4, 5, 6))
  a <- i
} yield {
  //  Thread.sleep(1000)
  a + 10
}


// ERROR
//val ints4: Array[Int] = for (
//  i <- Array(Array(1, 2, 3), Array(4, 5, 6));
//  a <- i ){
//  //  Thread.sleep(1000)
//  yield a + 10
//}


throw new IllegalArgumentException

val half =
  if (3 % 2 == 0) "Some value"
  else throw new IllegalArgumentException

println(half.charAt(0))

val half2 =
  if (3 % 2 == 0) "Some value"
  else println("Fail")

//half2.charAt(0) // err

