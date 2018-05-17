package imports

import bobsdelights.Fruit


class Imports {

  def m = {
    import bobsdelights._
    Fruits

    import bobsdelights.Fruits._
    Orange
    Apple


  }

  def showFruit(fruit: Fruit): Unit = {
    import fruit._
    println(name + "s are " + color)
  }

  def regex(): Unit = {
    import java.util.regex
//    regex.Pattern.compile("some regex")
  }

  def partialImports() = {
    import bobsdelights.Fruits.{Apple}
  }

  def rename = {
    import bobsdelights.Fruits.{Apple => MacOS}

    MacOS.color
//    Apple.
  }

}
