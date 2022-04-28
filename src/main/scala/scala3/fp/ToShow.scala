package scala3.fp

trait ToShow:

  def toShow: String

class StringToShow(value: => String) extends ToShow :

  override def toShow: String = value
