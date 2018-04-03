import java.io.File

object FileMatcher {

  def main(args: Array[String]): Unit = {
    val files = filesEnding(".scala")
    files.foreach(println)
    filesContaining("scala").foreach(println)
  }

  def filesMatching(matcher: (String) => Boolean) =
    for (file <- filesHere if matcher(file.getName))
      yield file

  def filesEnding(query: String): Array[File] =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String): Array[File] =
    filesMatching(_.contains(query))

  def filesRegex(query: String): Array[File] =
    filesMatching(_.matches(query))

  private def filesHere = new File("/home/narek/IdeaProjects/scala-professional-programming/control_abstraction/" +
    "src/scala").listFiles
}
