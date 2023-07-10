object Q4 {
  def evenOrOdd(n: Int): String = {
    if(n == 0) return "Even" else if (n == 1) return "Odd"
    evenOrOdd(n-2)
  }
  def main(args:Array[String]): Unit = {println(evenOrOdd(7))}
}