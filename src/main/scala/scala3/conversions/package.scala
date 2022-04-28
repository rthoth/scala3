package scala3.conversions

import scala3.Circle

given Conversion[Int, Circle] = x => Circle(x, x, x)

given Conversion[Circle, Int] = _.radius.toInt