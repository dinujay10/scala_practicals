object Q1 {
  val calculateInterest: Double => Double = {
    case depositAmount if depositAmount <= 20000 => depositAmount * 0.02
    case depositAmount if depositAmount <= 200000 => depositAmount * 0.04
    case depositAmount if depositAmount <= 2000000 => depositAmount * 0.035
    case depositAmount => depositAmount * 0.065
  }
  def main(args: Array[String]): Unit = {
    val deposit: Double = 250000
    val interest: Double = calculateInterest(deposit)
    println(s"The interest earned on Rs. $deposit is Rs. $interest")
    }
  }

