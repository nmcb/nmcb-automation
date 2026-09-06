package na
package nmcb

import scala.io.*

object Day0102:

  val day: String =
    this.getClass.getSimpleName.init match
      case s"Day$name" => name

  val input: List[String] =
    Source
      .fromResource(s"nmcb$day.txt")
      .getLines()
      .toList

  lazy val start1: Long = System.currentTimeMillis
  lazy val answer1: Int = 0

  def main(args: Array[String]): Unit =
    println(s"Answer day $day part 1: $answer1 [${System.currentTimeMillis - start1}ms]")