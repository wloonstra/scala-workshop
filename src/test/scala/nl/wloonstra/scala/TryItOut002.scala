package nl.wloonstra.scala

import org.scalatest.FunSuite

class TryItOut002 extends FunSuite {

  test("numbers written as words: which length of the word is the same as the value?") {
    // 1) define a case class which holds a number (Int) and its String word
    // 2) define a list of these case classes for values 1 till 5 and assign it to a val
    // 3) map the list to only those for which the length of the word is the same as its value
    // 4) print the result

    case class MyNumber(number: Int, description: String)
    val numbers = List(MyNumber(1, "one"), MyNumber(2, "two"), MyNumber(3, "three"), MyNumber(4, "four"), MyNumber(5, "five"))
    val filtered = numbers.filter(mn => mn.number == mn.description.length)
    println(filtered)
  }
}
