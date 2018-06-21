for {
  i <- List(List(1), List(2), List(3))
  c <- 1 to 2
  q = (1, c)
} yield q :: i

/*
res0: List[List[Any]] =
  List(
    List((1,1), 1),
    List((1,2), 1),

    List((1,1), 2),
    List((1,2), 2),

    List((1,1), 3),
    List((1,2), 3))

 */