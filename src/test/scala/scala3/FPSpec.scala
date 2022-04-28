package scala3

import org.scalatest.freespec.AnyFreeSpecLike
import org.scalatest.matchers.should.Matchers
import scala3.fp.io.IO
import scala3.fp.io.given
import scala3.fp.syntax.*
import scala3.fp.syntax.given

class FPSpec extends AnyFreeSpecLike, Matchers :

  "A simple fictional IO" in {

    for
      typed <- IO.readLine("Please, type something.")
      _ <- IO.printLine(s"So, you've written : $typed")
    yield
      System.currentTimeMillis()
  }
