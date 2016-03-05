package nl.wloonstra.scala

class Pres003 {

  // class
  // has methods (parameters always val)
  // has fields (assign them val or var or not (= private))

  class Person(name: String, val age: Int) {
    def description() = {
      name + " is " + age + " years old."
    }
  }

  val me = new Person("Wiggert", 29)
  me.age
  // won't compile: println(me.name)
  me.description()

  // No statics in class
  // Use Object

  object Calculator {
    def max(x: Int, y: Int) = {
      if (x > y) x else y
    }
  }

  Calculator.max(3, 5)

  // Special class
  case class Person2(name: String, age: Int)

  // Like a pojo
  // By default: all fields are val
  // By default: equals, hashcode, toString

  // TryItOut002



}
