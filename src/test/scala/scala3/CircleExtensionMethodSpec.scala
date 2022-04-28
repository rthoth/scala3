package scala3

import org.scalatest.freespec.AnyFreeSpecLike
import scala3.extension_method.*
import org.scalatest.matchers.should.Matchers
import scala3.extension_method.SquareExtension.toCircle

class CircleExtensionMethodSpec extends AnyFreeSpecLike with Matchers {

  val circle = Circle(0, 0, 10)
  val square = Square(0, 0, 10)

  "Area" in {
    circle.area should be(314.15 +- 0.1)
  }

  "Circumference" in {
    circle.circumference should be(62.8 +- 0.1)
  }

  "Diameter" in {
    circle.diameter should be(20D +- 0.1)
  }

  "Square to circle / diameter" in {
    square.toCircle.diameter should be(20D +- 0.1)
  }
}
