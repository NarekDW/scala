
def fibonLoop(int: Int): Int = {
  var a = 1
  var b = 1
  var c = 0
  for (_ <- 3 to int) {
    c = a + b
    a = b
    b = c
  }
  c
}

def fibon(int: Int): Int =
  if (int <= 2) 1 else fibon(int - 1) + fibon(int - 2)



val i = 48
//fibonLoop(i)
//fibon(i)

import java.io.File

import scala.io.Source

val filesHere: Array[File] = new File(".").listFiles()
for (file <- filesHere) {
  println(file)
}

for (i <- 1 to 5)
  println(i)

for (i <- 1 until 5)
  println(i)


// for + if
for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)

for (file <- filesHere)
  if (file.getName.endsWith(".scala"))
    println(file)

for (file <- filesHere
     if file.isFile
     if file.getName.endsWith(".scala")
) println(file)


def grep(pattern: String) = for (
  file <- filesHere
  if file.getName.endsWith(".scala");
  line <- fileLines(file)
  if line.trim.matches(pattern)
) println(file + ": " + line.trim)


def grep2(pattern: String) = for {
  file <- filesHere
  if file.getName.endsWith(".scala")
  line <- fileLines(file)
  if line.trim.matches(pattern)
} println(file + ": " + line.trim)


def fileLines(value: File) =
  Source.fromFile(value).getLines.toList

grep(".*gcs.*")


def grep3(pattern: String) = for {
  file <- filesHere
  if file.getName.endsWith(".scala")
  line <- fileLines(file)
  // without val or var
  trimmed = line.trim
  if trimmed.matches(pattern)
} println(file + ": " + trimmed)

