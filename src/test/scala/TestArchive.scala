package na
package nmcb
package test

import org.scalatest.funsuite.AnyFunSuite

class TestArchive extends AnyFunSuite:
  // week 01
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
    assertResult(Day0105.tasks.size)(actual = Day0105.tasksDone)
  }
  // week 02
  test("Day0108 - Scrum Process") {
    assertResult(Day0108.tasks.size)(actual = Day0108.tasksDone)
  }
  test("Day0109 - NA Introduction Day") {
    assertResult(Day0109.tasks.size)(actual = Day0109.tasksDone)
  }
