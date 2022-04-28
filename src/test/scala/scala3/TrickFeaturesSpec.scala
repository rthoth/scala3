package scala3

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import scala3.extension_method.*

class TrickFeaturesSpec extends AnyFreeSpec with Matchers {

  "Implicit conversion" in {
    import scala3.conversions.given
    2.diameter should be(4)
    (Circle(0D, 0D, 10D) : Int) should be(10)
  }

}
