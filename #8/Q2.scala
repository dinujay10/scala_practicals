import scala.io.StdIn.readInt
object Q2 {
  def PatternMatching(num: Int) = num match {
    case x if x<=0 => "Negative/Zero";
    case x if x%2==0 => "Even number is given";
    case x if x%2!=0 => "Odd number is given";
  }
  def main(args: Array[String]): Unit = {
    println("Enter integer: ");
    var num = readInt();
    println(PatternMatching(num));
  }
}