package nl.wloonstra.scala

class Pres004 {

  // Map
  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

  // Optional

//  Option[Type]
//  None

  val city: Option[String] = capitals.get("France")

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }

  show(capitals.get("France"))
  // "Paris"
  show(capitals.get("Japan"))
  // "Tokyo"
  show(capitals.get("Holland"))
  // "?"

  // Why?
  // Option[String] more clear it can be None than String can be null
  // Using a value before checking null: is now a type error

  // Example with List functions, pattern matching and tail recursion

  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail => head + sum(tail)
  }

  sum(List(1, 2, 3, 4))
  // 10

  // TryItOut003

}
