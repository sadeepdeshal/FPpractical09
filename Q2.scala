object Q2 {

  val classifyNumber: Int => String = (number: Int) => number match {
    case n if n <= 0 => "Negative/Zero is input"
    case n if n % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }

  def main(args: Array[String]): Unit = {
    println("Please enter an integer:")

    val input = scala.io.StdIn.readLine().toInt

    println(classifyNumber(input))

  }
}
