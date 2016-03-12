package nl.wloonstra.scala

import org.scalatest.FunSuite

class TryItOut002 extends FunSuite {

  test("Experimenting with lists") {
    // 1) write a function that takes a String and returns the length of the String
    // 2) apply the function to the values 'Java', 'Scala', 'Oracle' and print the result
    // 3) assign a val 'numbers' which is a List containing the Strings 'one', 'two', 'three', 'four', 'five'
    // 4) map the list 'numbers' to a list with the length of each string. Use the function from 1)
    // 5) print the result

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
