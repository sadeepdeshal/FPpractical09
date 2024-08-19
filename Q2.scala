import scala.io.StdIn._

object Q2 {

  val classifyNumber: Int => String = (number: Int) => number match {
    case n if n <= 0 => "Negative/Zero is input"
    case n if n % 2 == 0 => "Input is a Even number"
    case _ => "Input is a Odd number"
  }

  def main(args: Array[String]): Unit = {
    println("Please enter an integer:")

    val input = scala.io.StdIn.readLine()

    if (input.forall(_.isDigit)) {
      val number = input.toInt
      println(classifyNumber(number))
    } else {
      println("Please provide a valid integer.")
    }
  }
}
