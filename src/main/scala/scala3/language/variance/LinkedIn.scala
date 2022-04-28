package scala3.language.variance

trait Animal:

  def name: String

trait Mammal extends Animal

trait Bird extends Animal

class Dog(val name: String) extends Mammal

class Hummingbird(val name: String) extends Bird

object CovariantExample extends App :

  class Cell[+T](val value: T):

    def withValue[U >: T](value: U): Cell[U] = Cell(value)


  def printMammalName(cell: Cell[Mammal]): Unit =
    println(s"Mammal: ${cell.value.name}")

  def printBirdName(cell: Cell[Bird]): Unit =
    println(s"Bird: ${cell.value.name}")

  def printAnimalName(cell: Cell[Animal]): Unit =
    println(s"Animal: ${cell.value.name}")

  val dogCell = Cell(Dog("Bob"))

  val hummingbirdCell = Cell(Hummingbird("Joe"))

  printMammalName(dogCell)

  printBirdName(hummingbirdCell)

  printAnimalName(dogCell)

  printAnimalName(hummingbirdCell)

  val dogAnimalCell: Cell[Animal] = dogCell.withValue(Hummingbird("New Joe"))

  val hummingAnimalCell: Cell[Animal] = hummingbirdCell.withValue(Dog("New Bob"))

  printAnimalName(dogAnimalCell)

  printAnimalName(hummingAnimalCell)

object ContravariantExample extends App:

  trait F[-I, O]:

    def apply(input: I): O

  def printBirdSpeciesName(f: F[Bird, String]): Unit =
    println(s"Species name: ${f(Hummingbird("Yoshi"))}")

  val anyAnimalName: F[Animal, String] = animal => s"Undefined ${animal.name.toLowerCase}s"

  printBirdSpeciesName(anyAnimalName)


