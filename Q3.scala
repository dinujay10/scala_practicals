object Q3 {
  def sum(n:Int): Int = {if(n<=0) return 0 else n + sum(n-1)}
  def main(args: Array[String]): Unit = {println(sum(5))}
}