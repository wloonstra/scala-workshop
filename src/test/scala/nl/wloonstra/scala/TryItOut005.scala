package nl.wloonstra.scala

import java.util.Collections

import org.scalatest.FunSuite

class TryItOut005 extends FunSuite {

  test("max temperature") {
    // below the max temperatures by day in Rotterdam for Februari 2016
    // according to: http://www.accuweather.com/nl/nl/rotterdam/251688/february-weather/251688?monyr=2/1/2016
    val tempFebRotterdam = List(12, 11, 7, 10, 11, 11, 12, 10, 8, 8, 8, 6, 4, 3, 7, 7, 4, 3, 8, 11, 11, 11, 8, 7, 6, 6, 6, 6, 6)

    // 1) use the java.util.Collections.max() method to print the max temperature in Rotterdam for February 2016.
    
    import scala.collection.JavaConverters._
    println(Collections.max(tempFebRotterdam.map(i => i: java.lang.Integer).asJava))

  }

}
