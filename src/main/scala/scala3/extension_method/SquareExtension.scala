package scala3.extension_method

import scala3.{Circle, Square}

object SquareExtension:

  extension (s: Square)
    def toCircle: Circle = Circle(s.x, s.y, s.diagonal)

