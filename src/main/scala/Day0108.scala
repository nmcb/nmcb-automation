import scala.io.*

object Day0108 extends App:

  val day: String =
    this.getClass.getSimpleName.init match
      case s"Day$name" => name

  val tasks: List[Task] =
    Source
      .fromResource(s"nmcb$day.txt")
      .getLines
      .filterNot(_.isBlank)
      .filterNot(_.trim.startsWith("--"))
      .map:
        case s"$name=$done" => Task(name, done.toBoolean)
      .toList

  case class Task(name: String, done: Boolean = false)

  val start1: Long =
    System.currentTimeMillis

  val tasksDone: Int =
    tasks.count(_.done)

  println(s"Answer day $day part 1: ${tasksDone} [${System.currentTimeMillis - start1}ms]")
