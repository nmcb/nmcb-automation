package na
package nmcb

import scala.io.*

object Day0103:

  val day: String =
    this.getClass.getSimpleName.init match
      case s"Day$name" => name

  lazy val tasks: List[Task] =
    Source
      .fromResource(s"nmcb$day.txt")
      .getLines()
      .map:
        case s"$name=$done" => Task(name, done.toBoolean)
      .toList

  case class Task(name: String, done: Boolean = false)

  lazy val start1: Long   = System.currentTimeMillis
  lazy val tasksDone: Int = tasks.count(_.done)

  def main(args: Array[String]): Unit =
    println(s"Answer day $day part 1: $tasksDone [${System.currentTimeMillis - start1}ms]")