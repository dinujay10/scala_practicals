object Q2 {
  def greaterThanFive(list:List[String]):List[String] = {list.filter(_.length > 5)}
  def main(args:Array[String])={
    val list:List[String] = List("hello","dog","music","artist","Colombo","Slipper")
    println("Strings: "+ greaterThanFive(list).mkString(" "))
  }
}
