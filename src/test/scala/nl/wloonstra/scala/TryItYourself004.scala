package nl.wloonstra.scala

import org.scalatest.FunSuite

class TryItYourself004 extends FunSuite {

  class Point(val x: Int, val y: Int)

  test("Geometry") {
    // 1. create a class which represents a Rectangle (constr args: two Points)
    // 2. create a class which represents a Square (constr args: one Point and a size)
    // 3. define a method on both classes which calculates the surface
    // 4. test it
    // 5. refactor your solution from 3) to use a trait which contains the surface method
    // 6. test it

    // hint: a def in a trait can be a val in the class


    // version 1 - step 1-4

    class RectangleV1(leftTop: Point, rightBottom: Point) {
      def surface() = {
        (rightBottom.x - leftTop.x) * (leftTop.y - rightBottom.y)
      }
    }

    class SquareV1(leftTop: Point, side: Int) {
      def surface() = {
        (side * side)
      }
    }

    val v1 = new RectangleV1(new Point(2, 10), new Point(8, 4))
    println("version 1: rectangle: " + v1.surface())

    val s1 = new SquareV1(new Point(2, 10), 6)
    println("version 1: square: " + s1.surface())


    // version 2 - step 5-6
    trait Rectangular {
      def leftTop: Point
      def rightBottom: Point

      def surface = (rightBottom.x - leftTop.x) * (leftTop.y - rightBottom.y)
    }


    class RectangleV2(val leftTop: Point, val rightBottom: Point) extends Rectangular

    class SquareV2(val leftTop: Point, side: Int) extends Rectangular {
      def rightBottom = new Point(leftTop.x - side, leftTop.y + side)
    }

    val v2 = new RectangleV2(new Point(2, 10), new Point(8, 4))
    println("version 2: rectangle: " + v1.surface())

    val s2 = new SquareV2(new Point(2, 10), 6)
    println("version 2: square: " + s1.surface())

  }

}
