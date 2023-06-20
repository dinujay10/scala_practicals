object TemperatureConversion{
  def conversion(cel: Double):Double = (cel*1.8) + 32
  def main(args:Array[String]):Unit = println("Area of disk: "+conversion(35))
}
