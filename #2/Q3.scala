object Q3 {
  def takeHomeSal(normal: Int, OT: Int): Double = (((normal*250.0F) + (OT*85.0F)) * 0.88F)*4;
  def main(args:Array[String]): Unit = println("Take home Salary : " + takeHomeSal(40,30));
}
