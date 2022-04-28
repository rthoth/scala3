package scala3.extension_method

import scala3.Circle
import scala.math.Pi

class SuperCircleExtension(circle: Circle):

  extension(c: Circle)

    def diameter: Double = 2 * circle.radius

    def circumference: Double = 2 * Pi * circle.radius
