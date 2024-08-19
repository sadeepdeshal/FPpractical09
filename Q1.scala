package FP_Prac10

object Q1 {

  val calculateInterest: Double => Double = (deposit: Double) => deposit match {
    case d if d <= 20000 => d * 0.02
    case d if d <= 200000 => d * 0.04
    case d if d <= 2000000 => d * 0.035
    case d if d > 2000000 => d * 0.065
  }

  def main(args: Array[String]): Unit = {
    val list1= List(17000.0, 40000.0, 500000.0, 4000000.0)
    list1.foreach(num => {
      println(s"Deposit: Rs.$num - Interest: Rs.${calculateInterest(num)}")
    })
  }
}