package nl.wloonstra.scala

import org.scalatest.FunSuite
import sun.security.krb5.internal.crypto.Nonce

class TryItOut003 extends FunSuite {

  test("Playing a Bandit") {
    // 1. write an object Bandit which has a play(Int) method.
    // you can call it with the numbers 1, 2 or 3.
    // 2. Choose two numbers which return a price ('cash' and 'play again') as an Option[String]
    // For the third number return None.
    // For numbers outside the range return None.
    // Use a match construction.

    // 3. write a method in this test class which plays the Bandit.
    // for each play it will print a nice string telling you:
    // - which number was played
    // - if there was a result, and if so, what the result was
    // Use a match construction.

    // 4. call the bandit with numbers 1 till 4

    object Bandit {
      def play(number: Int) = number match {
        case 1 => None
        case 2 => Some("play again")
        case 3 => Some("cash!")
        case _ => None
      }
    }

    def playBandit(number: Int) = {
      val winningPart = Bandit.play(number) match {
        case Some(result) => "You have won " + result
        case None => "You didn't win anything."
      }
      println("Played the number " + number + ". " + winningPart)
    }

    playBandit(1)
    playBandit(2)
    playBandit(3)
    playBandit(4)

    // WL: eerst implementeren t/m 3. Dan runnen voor 4. Zie de foutmelding.
    // WL: dan fixen.

  }



}
