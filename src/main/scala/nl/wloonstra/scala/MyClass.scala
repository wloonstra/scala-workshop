package nl.wloonstra.scala

class MyClass {

//   no ; (semicolons) - almost no semicolons

//   Fields:

  val name1: String = "Wiggert"
  val name2 = "Wiggert"
//  name2 = "Robin" // error

  var name = "Wiggert"
  name = "Robin"

//  Methods:

  def addTwo(input: Int) = {
    input + 2
  }

//  - = sign is important
//  - zonder = wordt het een void method
//  - no 'return', last sentence always returned

  def hello() {
    println("Hello world")
  }

//  call by:
  hello()
//  or
  hello

//  Function:

  val addTwo = (i: Int) => i + 2
//  let op pijl met =teken

//  Function meegeven:

  def logExecution(f: () => Unit) = {
    println("starting")
    f.apply
    println("done")
  }

  //  call by:
  logExecution(hello)


}
