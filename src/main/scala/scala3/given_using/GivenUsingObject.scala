package scala3.given_using

import scala3.{Circle, Square}
import scala3.extension_method.intersection

object GivenUsingObject:

  extension (circle: Circle)
    def clip()(using Square): Circle =
      circle.intersection(summon[Square])

