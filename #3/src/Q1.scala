object Q1 {
  def reverse(input:String):String = {if(input.isEmpty) "" else reverse(input.tail) + input.head}
  def main(args:Array[String])={
    var str:String = "Hello"
    println("Reversed String: " + reverse(str))
  }
}
