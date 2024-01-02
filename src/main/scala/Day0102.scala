package na
package nmcb

import scala.io._

object Day0102 extends App:

  val day: String =
    this.getClass.getSimpleName.init match
      case s"Day$name" => name
      case obj => obj

  val input: List[String] =
    Source
      .fromResource(s"nmcb$day.txt")
      .getLines
      .toList

  val start1: Long = System.currentTimeMillis
  val answer1: Int = 0
  println(s"Answer day $day part 1: ${answer1} [${System.currentTimeMillis - start1}ms]")