package nl.wloonstra.scala

class Pres002 {

//  Lists

  val numbers = List(5, 6, 7, 8, 9)

//  Lists are always immutable

//  adding an element creates a new list which you can assign

  val moreNumbers = 4 :: numbers

//  Methods of list:

  numbers(0)

  numbers.filter(i => i > 6)
  numbers.count(i => i < 6)

  numbers.head // 5
  numbers.tail // List(6, 7, 8, 9)

  numbers.init // List(5, 6, 7, 8)
  numbers.last // 9

  numbers.map(i => i + 1)

  // empty list
  Nil

  // underscore notation
  numbers.filter(i => i > 6)
  numbers.filter(_ > 6)

  // tryItOut002




}
