
object Q4 {
  def cost(attendees: Int): Double = attendees*3 + 500;
  def profit(attendees: Int, price: Double): Double = (attendees*price) - cost(attendees);
  def main(args:Array[String]): Unit = if ((profit(140,10))>(profit(100,20))) println("Rs. 10 per ticket is more profitable") else println("Rs. 20 per ticket is more profitable");
}
