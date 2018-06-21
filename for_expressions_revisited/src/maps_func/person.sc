case class Person(name: String,
                  isMale: Boolean,
                  children: Person*)

val p = Person

val lara = Person("Lara", isMale = false)
val bob = Person("Bob", isMale = true)
val julie = Person("Julie", false, lara, bob)
val persons = List(lara, bob, julie)

val couples1 =
  persons filter
    (!_.isMale) flatMap
    (p => p.children map
      (c => (p.name, c.name)))
couples1

// Optimized
// This would avoid the creation of an intermediate data structure for male persons
val couples2 =
persons withFilter
  (p => !p.isMale) flatMap
  (p => p.children map
    (c => (p.name, c.name)))
couples2

// using for expression
val couples3 =
  for (p <- persons; if !p.isMale; c <- p.children; if !c.isMale)
    yield (p.name, c.name)
couples3

/*
    All for expressions that yield a result are translated by the compiler into
  combinations of invocations of the higher-order methods map , flatMap ,
  and withFilter . All for loops without yield are translated into a smaller set
  of higher-order functions: just withFilter and foreach
 */

// FOR pattern
val f =
  for (p <- persons; n = p.name; if n startsWith "La")
    yield n
f

val f2 =
  for {
    p <- persons              // a generator
    n = p.name                // a definition
    if n startsWith "La"      // a filter
  } yield n
f2


