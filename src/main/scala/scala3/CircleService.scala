package scala3

trait CircleService {

  def price(circle: Circle): Money

  def colored(circle: Circle): Colored[Circle]
}


class CircleServiceImpl extends CircleService {

  def price(circle: Circle): Money = Money(0, "BRA")

  def colored(circle: Circle): Colored[Circle] = ???
}