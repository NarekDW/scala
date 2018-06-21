val xs = List(1, 2, 3, 4, 5)


// Other iterators:
val git = xs grouped 3
git.next()
git.next()
//git.next() // java.util.NoSuchElementException: next on empty iterator

val sit = xs sliding 3
sit.next()
sit.next()
sit.next()
//sit.next() // java.util.NoSuchElementException: next on empty iterator


// Abstract method:
val it = xs.iterator
it.next()
it.next()
it.next()
it.next()
it.next()
//it.next() // java.util.NoSuchElementException: next on empty iterator


// Subcollections:
val tr = xs takeRight 2
val dr = xs dropRight 2


// Zippers:
val ys = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)

val z = xs zip ys
// Если не хвататет эл-тов у xs, дополнить 777
// если у ys - то дополнить 'xxx
val za = xs zipAll (ys, 777, 'xxx)
val ys2 = List('a, 'b)
val za2 = xs zipAll (ys2, 777, 'xxx)

val zpindx = xs.zipWithIndex
zpindx.unzip


// Comparison:
val comp = List(1, 2, 3, 4, 5)
xs sameElements comp

val comp2 = List(1, 2, 3, 4, 5, 6)
xs sameElements comp2
