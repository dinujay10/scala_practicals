object Q1 {
  def prime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2)
      return n == 2
    if (n % i == 0)
      return false
    if (i * i > n)
      return true
    prime(n, i + 1)
  }
  def main(args: Array[String]): Unit = {if(prime(5)) println("Is a prime number") else println("Not a prime number")}
}