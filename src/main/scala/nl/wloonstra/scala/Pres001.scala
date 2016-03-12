package nl.wloonstra.scala

class Pres001 {

//  Scala
//
//  object-oriented
//  functional programming
//  statically typed language
//
//  function value is an object

  val favoriteNumber: Int = 31

  val name: String = "Wiggert"
  val nameWithoutType = "Wiggert"

  println(name)

//  no reassignment

  var time = "12:00"
  time = "13:00"



//  A function

  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }

//  variables have types
//  return type

//  = sign: function defines an expression that results in a value

  def max2(x: Int, y: Int) = {
    if (x > y) x else y
  }


}
