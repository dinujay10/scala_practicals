object Q5 {
  def addEven(n: Int): Int = {
    if (n <= 0) return 0 else if(n % 2 == 0) return n + addEven(n - 2)
    addEven(n - 1)
  }
  def main(args: Array[String]): Unit = {println(addEven(7))}
}