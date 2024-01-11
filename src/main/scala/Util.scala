package na
package nmcb
package util

/** returns given string `s` left padded with given amount of `spaces` */
def leftPad(s: String, spaces: Int): String =
  assert(spaces > 0, s"amount of spaces should be positive: spaces=$spaces")
  List.fill(spaces)(' ').toString + s
  