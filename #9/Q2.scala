class Rational2(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private val gcdValue: Int = gcd(n.abs, d.abs)
  val numer: Int = n / gcdValue
  val denom: Int = d / gcdValue

  def this(n: Int) = this(n, 1) // Auxiliary constructor for whole numbers

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational2 = new Rational2(-numer, denom)

  def sub(other: Rational2): Rational2 = {
    new Rational2(numer * other.denom - other.numer * denom, denom * other.denom)
  }

  override def toString: String = s"$numer/$denom"
}

object Q2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational2(3, 4)
    val y = new Rational2(5, 8)
    val z = new Rational2(2, 7)

    val result = x.neg.sub(y).sub(z)

    println(s"x = $x")
    println(s"y = $y")
    println(s"z = $z")
    println(s"xy - z = $result")
  }
}
