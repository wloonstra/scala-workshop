package nl.wloonstra.scala

class Pres005 {

  // Combination with Java

  // All code on jvm, so scala and java class can call each other!

  // Maven to include scala:
  // <>

  // Java and Scala
  // implicit conversion: where needed, it converts an object into something else specified


  def something(names: java.util.List[String]) = {
    // do something with names
  }

  def useScalaInJavaEnvironmentWrong() = {
    val scalaEnthusiasts: List[String] = List("Robin", "Wiggert")

//    something(scalaEnthusiasts)
  }

  def useScalaInJavaEnvironmentCorrect() = {
    import scala.collection.JavaConverters._

    val scalaEnthusiasts: List[String] = List("Robin", "Wiggert")

    something(scalaEnthusiasts.asJava)
  }


  def javaFunctionWithInts(javaInts: java.util.List[java.lang.Integer]) = {
    // do something with the ints
  }

  def useScalaInJavaEnvironmentExtended() = {
    // watch out for type of element in list
    import scala.collection.JavaConverters._

    val scalaNumbers: List[Int] = List(1, 2, 3, 4, 5, 6)

//    javaFunctionWithInts(scalaNumbers.asJava)

    // now you have to do some magic:
    javaFunctionWithInts(scalaNumbers.map(i => i: java.lang.Integer).asJava)
  }



}
