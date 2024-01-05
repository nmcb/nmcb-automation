package na
package nmcb
package test

import org.scalatest.funsuite.AnyFunSuite

class TestArchive extends AnyFunSuite:
  test("Day0102 - Meet The Team") {
    assertResult(0)(actual = Day0102.answer1)
  }
  test("Day0103 - Local Tasks") {
    assertResult(Day0103.tasks.size)(actual = Day0103.tasksDone)
  }
  test("Day0104 - Python Minio") {
    assertResult(Day0104.tasks.size)(actual = Day0104.tasksDone)
  }
  test("Day0105 - Scala Minio") {
    assertResult(Day0104.tasks.size)(actual = Day0105.tasksDone)
  }
