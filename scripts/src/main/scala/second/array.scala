val nums = Array("one", "two", "three")
println("nums(0) = " + nums(0))

val one = List(1)
val two = List(2)
//val three = one ::: two
val three = two.:::(one)
println(one + "\n" + two + "\n" + three)

//val three2 = one :: two
val three2 = two.::(one)
println(three2) // List(List(1), 2)


val ints = 1 :: 2 :: 3 :: Nil
println("ints = " + ints) // List(1, 2, 3)

println("ints.count(i => i > 1) = " + ints.count(i => i > 1))



val kort = (99, "Hi")
println("kort._1 = " + kort._1)
println("kort._2 = " + kort._2)
