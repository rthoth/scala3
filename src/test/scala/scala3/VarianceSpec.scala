package scala3

import scala3.language.variance.{ContravariantInstance, CovariantInstance, InvariantInstance}

class VarianceSpec extends Spec {

  trait Animal

  trait Mammal extends Animal

  trait Bird extends Animal

  class Dog extends Mammal

  class Cat extends Mammal

  class Hummingbird extends Bird

  "Invariant" in {

    def sayHello(mammal: InvariantInstance[Mammal]): Unit = {
      println(mammal.value)
    }

    val mammal = InvariantInstance[Mammal](new Dog)
    val dog = InvariantInstance(new Dog)
    val animal = InvariantInstance[Animal](new Hummingbird)

    sayHello(mammal)
//        sayHello(animal)
//        sayHello(dog)
  }

  "Covariant" in {

    def sayHello(mammal: CovariantInstance[Mammal]): Unit = {
      println(mammal)
    }

    val cat = CovariantInstance(new Cat)
    val dog = CovariantInstance(new Dog)
    val hummingbird = CovariantInstance(new Hummingbird)

    sayHello(cat)
    sayHello(dog)
//        sayHello(hummingbird)
  }

  "Contravariant" in {
    def sayHello(mammal: ContravariantInstance[Mammal, String]): Unit = {
      println(mammal(Dog()))
    }

    val animal: ContravariantInstance[Animal, String] = _.getClass.toString
    val bird: ContravariantInstance[Bird, String] = _.getClass.toString

    sayHello(animal)
//        sayHello(bird)
  }
}