def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield {
    val prod = row * col toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }

def makeRow(row: Int) = makeRowSeq(row) mkString

def multiTable = {
  val tableSeq =
    for (row <- 1 to 10) yield makeRow(row)

  tableSeq mkString "\n"
}

println(multiTable)

def makeRow2(row: Int): String = {
  val strings = for (col <- 1 to 10) yield {
    val prod = row * col toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }
  strings mkString
}

def multiTable2 = {


  val tableSeq =
    for (row <- 1 to 10) yield makeRow2(row)

  tableSeq mkString "\n"
}

println(multiTable2)

