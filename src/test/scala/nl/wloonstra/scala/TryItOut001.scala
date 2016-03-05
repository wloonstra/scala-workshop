package nl.wloonstra.scala

import org.scalatest.FunSuite

class TryItOut001 extends FunSuite {

  test("My first example with Scala") {
    // 1) write a function that takes a String and returns the number of characters
    // 2) apply it to values 'Java', 'Scala', 'Oracle' and print the result
    // 3) assign a val 'numbers' which is a List containing the Strings 'one', 'two', 'three', 'four', 'five'
    // 4) map the values with the function and print the result

    def toSize(s: String) = s.length

    println(toSize("java"))
    println(toSize("scala"))
    println(toSize("oracle"))

    val numbers = List("one", "two", "three", "four", "five")

    println(numbers.map(s => toSize(s)))
    // or
    println(numbers.map(toSize(_)))
    // or
    println(numbers.map(toSize))
  }
}
