package na
package nmcb

import scala.io.*

object Day0103 extends App:

  val day: String =
    this.getClass.getSimpleName.init match
      case s"Day$name" => name

  val tasks: List[Task] =
    Source
      .fromResource(s"nmcb$day.txt")
      .getLines
      .map:
        case s"$name" => Task(name)
      .toList

  case class Task(name: String, done: Boolean = false)

  val start1: Long = System.currentTimeMillis
  val tasksDone: Int = tasks.count(_.done)
  println(s"Answer day $day part 1: ${tasksDone} [${System.currentTimeMillis - start1}ms]")