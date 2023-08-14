object Q3 {
  def toUpper(str: String): String = str.toUpperCase;
  def toLower(str: String): String = str.toLowerCase;
  def formatNames(name: String)(func: String => String): String = func(name);
  def main(args: Array[String]): Unit = {
    var name1 = "Benney";
    var name2 = "Niroshan";
    var name3 = "Saman";
    var name4 = "Kumara";
    println(formatNames(name1)(toUpper));
    println(formatNames(name2.take(2))(toUpper) + formatNames(name2.drop(2))(toLower));
    println(formatNames(name3)(toLower));
    println(name4.dropRight(1) + formatNames(name4.takeRight(1))(toUpper));
  }
}
