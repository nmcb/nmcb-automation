package na
package nmcb

import java.time.LocalDate
import scala.io.*

object DayRunner extends App:

  case class Task(name: String, done: Boolean = false)

  case class Day(tasks: Task, date: LocalDate)

  val days: List[Day] =
    ???

  val start1: Long =
    System.currentTimeMillis

  val tasksDone: Int =
    ???

//  println(s"Answer day $day part 1: ${tasksDone} [${System.currentTimeMillis - start1}ms]")
