List(1, 2, 3) == List.apply(1, 2, 3)
List.range(4, 2, -1)
List.fill(3)("a")
List.fill(2, 3)("b")
List.fill(2, 2, 2)("c")
List.tabulate(5)(n => n * n)
List.tabulate(5)(n => n)
List.tabulate(3, 3)(_ * _)
List.concat(List("a"), List("b"))

(List(10, 20), List(3, 4, 5)).zipped.map(_ * _)
(List("a", "bb"), List(1, 2, 5)).zipped.forall(_.length == _)
(List("a", "bb"), List(1, 2, 5)).zipped.exists(_.length != _)


