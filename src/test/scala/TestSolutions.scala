package na
package nmcb
package test

import org.scalatest.funsuite.AnyFunSuite

class TestSolutions extends AnyFunSuite:
  test("Day0102") {
    assertResult(0)(actual = Day0102.answer1)
  }
