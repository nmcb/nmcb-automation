package na
package nmcb

import java.time.LocalDate

object DayRunner extends App:

  case class Task(name: String, done: Boolean = false)

  case class Day(tasks: Task, date: LocalDate)

  val days: List[Day] =
    List.empty

  lazy val start1: Long =
    System.currentTimeMillis

  lazy val tasksDone: Int =
    0

//  println(s"Answer day $day part 1: $tasksDone [${System.currentTimeMillis - start1}ms]")
