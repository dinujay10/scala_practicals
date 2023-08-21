class Rational1(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private val gcdValue: Int = gcd(n.abs, d.abs)
  val numer: Int = n / gcdValue
  val denom: Int = d / gcdValue

  def this(n: Int) = this(n, 1) // Auxiliary constructor for whole numbers
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def neg: Rational1 = new Rational1(-numer, denom)
  override def toString: String = s"$numer/$denom"
}

object Q1 {
  def main(args: Array[String]): Unit = {
    val x = new Rational1(3, 4)
    val negX = x.neg
    println(s"x = $x")
    println(s"-x = $negX")
  }
}