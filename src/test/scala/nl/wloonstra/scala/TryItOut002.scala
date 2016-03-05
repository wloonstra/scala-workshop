package nl.wloonstra.scala

import org.scalatest.FunSuite

class TryItOut002 extends FunSuite {

  test("numbers written as words: which length of the word is the same as the value?") {
    // In this example we are going to compare a number (like '1') which its written out representation ('one')
    // and its length ('one' has length 3)

    // 1) define a case class which holds a number (Int) and its written out representation
    // 2) assign a list to a val with instances of this case class for values 1 till 5
    // 3) filter the list to only those values for which the length of the written out word is the same as its value itself
    // 4) print the result

    case class MyNumber(number: Int, description: String)
    val numbers = List(MyNumber(1, "one"), MyNumber(2, "two"), MyNumber(3, "three"), MyNumber(4, "four"), MyNumber(5, "five"))
    val filtered = numbers.filter(mn => mn.number == mn.description.length)
    println(filtered)
  }
}
