package scala3

import org.scalatest.freespec.AnyFreeSpecLike
import org.scalatest.matchers.should.Matchers
import scala3.given_using.GivenUsingObject._

class GivenAndUsingSpec extends AnyFreeSpecLike with Matchers {

  "A simple usage of using and given" in {
    given square: Square = Square(0, 0, 10)
    val intersection = Circle(0, 0, 10).clip()
  }
}
