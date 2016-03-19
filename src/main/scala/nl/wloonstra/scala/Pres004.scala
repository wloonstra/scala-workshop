package nl.wloonstra.scala

class Pres004 {

  // Map
  val capitals: Map[String, String] = Map("France" -> "Paris", "Japan" -> "Tokyo")

  // Optional

//  Option[Type]
//  None

  val name1: Option[String] = Some("Wiggert")
  val name2: Option[String] = None

  val city: Option[String] = capitals.get("France")

  def show1(x: Option[String]) = {
    if (x.isDefined) x.get else "?"
  }

  show1(capitals.get("France"))
  // "Paris"
  show1(capitals.get("Japan"))
  // "Tokyo"
  show1(capitals.get("Holland"))
  // "?"

  // matching

  def show2(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }

  show2(capitals.get("France"))
  // "Paris"
  show2(capitals.get("Japan"))
  // "Tokyo"
  show2(capitals.get("Holland"))
  // "?"

  // Why?
  // Option[String] more clear it can be None, than String can be null
  // Using a value before checking null: is now a type error

  // Example with List functions, pattern matching and tail recursion

  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail => head + sum(tail)
  }

  sum(List(1, 2, 3, 4))
  // 10

}
