package nl.wloonstra.scala

class Pres002 {

//  Lists

  val numbers = List(5, 6, 7, 8, 9)

//  Lists are always immutable

//  adding delivers a new list:

  val moreNumbers = 4 :: numbers

//  Methods of list:

  numbers(0)

  numbers.filter(i => i > 6)
  numbers.filter(_ > 6)
  numbers.count(i => i < 6)

  numbers.head // 5
  numbers.tail // 6, 7, 8, 9

  numbers.init // 5, 6, 7, 8
  numbers.last // 9

  numbers.map(i => i * i)

  // tryItOut001




}
