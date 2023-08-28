object Q1 extends App {
  def calculateAverage(temperatures: List[Int]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32.0)
    val totalFahrenheit = fahrenheitTemperatures.reduce((total, temp) => total + temp)
    val averageFahrenheit = totalFahrenheit / temperatures.length

    averageFahrenheit
  }

  val temperatures = List(0, 10, 20, 30)
  val averageFahrenheit = calculateAverage(temperatures)
  println(s"Average Fahrenheit temperature: $averageFahrenheit")
}