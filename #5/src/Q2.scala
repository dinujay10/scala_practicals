object Q2 {
  def prime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2)
      return n == 2
    if (n % i == 0)
      return false
    if (i * i > n)
      return true
    prime(n, i + 1)
  }

  def primeSeq(n: Int, num: Int = 2): Unit = {
    if (num < n) {
      if (prime(num))
        print(num + " ")
      primeSeq(n, num + 1)
    }
  }
  def main(args: Array[String]): Unit = {primeSeq(10)}
}