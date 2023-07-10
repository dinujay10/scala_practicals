object Q6 {
  def fibonacci(n: Int, a: Int = 0, b: Int = 1): Unit = {
    if (n > 0) {
      print(a + " ")
      fibonacci(n - 1, b, a + b)
    }
  }
  def main(args: Array[String]): Unit = {fibonacci(10)}
}