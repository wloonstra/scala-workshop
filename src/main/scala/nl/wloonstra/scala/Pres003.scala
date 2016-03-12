package nl.wloonstra.scala

class Pres003 {

  // class
  // has methods (parameters always val)
  // has fields (assign them val or var or not (= private))

  class Person(name: String, val age: Int) {
    def introduceYourself() = {
      "Hello. My name is " + name + " and I am " + age + " years old."
    }
  }

  val wiggert = new Person("Wiggert", 29)
  wiggert.age
  // wiggert.name // won't compile
  wiggert.introduceYourself()

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

}
