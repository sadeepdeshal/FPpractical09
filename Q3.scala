package FP_Prac10

object Q3 {

  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    println(formatNames(names(0), toUpper))
    println(formatNames(names(1), n => n.take(2).toUpperCase + n.drop(2).toLowerCase))
    println(formatNames(names(2), toLower))
    println(formatNames(names(3), n => n.dropRight(1) + n.takeRight(1).toUpperCase))
  }
}
