object BooksPrice{
  def discount(copies: Int): Double = 24.95*(1-0.4)*copies
  def shipping(copies: Int): Double = if(copies<=50) 3.0*50 else (3.0*50) + 0.75*(copies-50)
  def wholesaleCost(copies: Int): Double = shipping(copies) + discount(copies)
  def main(args:Array[String]):Unit = println("The wholesale cost for 60 copies is : "+wholesaleCost(60))
}
