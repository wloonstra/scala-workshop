package nl.wloonstra.scala

class Pres003b {

  // trait

  trait Happy {
    def sing(): Unit = {
      println("Ik ben vandaag zo vrolijk...")
    }
  }

  class Developer extends Happy

  def test() = {
    val d = new Developer
    d.sing
  }

  class Employee

  class JavaDeveloper extends Employee with Happy

  def test2() = {
    val d = new JavaDeveloper
    d.sing
  }



  class Rationa2(numer: Int, denom: Int)

  val twoThird = new Rational(2, 3)

  //   2
  //  ---
  //   3

  class Rational(numer: Int, denom: Int) {
    def < (that: Rational) = {
      this.numer * that.denom > that.numer * this.denom
    }
    def > (that: Rational) = that < this
    def <= (that: Rational) = (this < that) || (this == that)
    def >= (that: Rational) = (this > that) || (this == that)
  }


  // Solution with traits

  class Rational3(numer: Int, denom: Int) extends Ordered[Rational3] {
    def compare(that: Rational3) =
      (this.numer * that.denom) - (that.numer * this.denom)
  }


}
