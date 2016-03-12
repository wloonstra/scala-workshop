package nl.wloonstra.scala

import org.scalatest.FunSuite

import scala.util.Random

class TryItOut004 extends FunSuite {

  test("Playing a Bandit") {
    // We are going to program a bandit machine. To simplify the options, the bandit machine will return
    // one of these three String:
    // A. "cash"
    // B. "play again"
    // C. "nothing"

    // 1. write an object Bandit which has a play() method.
    // Let it randomly return one of the states.
    // Use: scala.util.Random (search for scalaDoc)
    // Use: pattern matching

    // 2. write a method in this test class which plays the Bandit.

    // 3. play the bandit multiple times


    object Bandit {
      def play() = {
        val number = Random.nextInt(3)
        number match {

          case 0 => println("cash!")
          case 1 => println("play again")
          case 2 => println("nothing")
        }
      }
    }


    Bandit.play()
    Bandit.play()
    Bandit.play()
    Bandit.play()
    Bandit.play()

  }

  test("Paper / Scissors / Stone") {
    // In the 2-player game 'paper, scissors, stone' each player has to choose one of the three options.
    // The following applies:
    // - paper vs scissors: scissors wins
    // - paper vs stone: paper wins
    // - scissors vs stone: stone wins
    // - same choice: nobody wins

    // 1) implement this with a play(x, y) method which accepts the choice of player1 and player2 as arguments
    //    use pattern matching for a tuple of two arguments
    //    you might want to use case classes for the options and let them all extend a super class


    class GameSelection
    case class Paper() extends GameSelection
    case class Scissors() extends GameSelection
    case class Stone() extends GameSelection

    object PSSGame {
      def play(selection1: GameSelection, selection2: GameSelection) = (selection1, selection2) match {
        case (s1, s2) if (s1 == s2) => "Tie"
        case (Paper(), s2) if (s2 == Stone()) => "Player 1 wins"
        case (Scissors(), s2) if (s2 == Paper()) => "Player 1 wins"
        case (Stone(), s2) if (s2 == Scissors()) => "Player 1 wins"
        case _ => "Player 2 wins"
      }
    }

    println(PSSGame.play(Paper(), Stone()))
    println(PSSGame.play(Paper(), Scissors()))
    println(PSSGame.play(Paper(), Paper()))

  }
}
