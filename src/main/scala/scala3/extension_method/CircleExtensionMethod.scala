package scala3.extension_method

import scala3.{Circle, Square}

import scala.math.Pi

extension (c: Circle)

  def circumference: Double = c.radius * Pi * 2

  def diameter: Double = c.radius * 2

  def area: Double = Pi * c.radius * c.radius

  def intersection(square: Square): Circle = c