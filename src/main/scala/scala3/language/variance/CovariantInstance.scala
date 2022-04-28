package scala3.language.variance

class CovariantInstance[+T](v: T):

  def value: T = v


trait ContravariantInstance[-T, +S]:

  def apply(t: T): S


class InvariantInstance[T](v: T):

  def value: T = v

