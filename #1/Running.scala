object RunningTime{
  def totRunTime(easyPace: Int, tempo: Int):Int = easyPace*8 + tempo*7
  def main(args:Array[String]): Unit = println("The total running time is : "+totRunTime(4,3))
}
