package nl.wloonstra.scala

class Pres004 {

  // Optional

  // An option is a wrapper around null
  val unstable = true

  def unstableOperation(): Option[String] = {
    if (unstable) {
      None
    } else {
      Some("result was found!")
    }
  }

  // no need to check for null
  // use matchers

  val result = unstableOperation()
  result match {
    case None => // return 500
    case Some(r) => // return 200 with result r
  }

}
