object Q2 {
  def main(args:Array[String]): Unit = {
    var a = 2;
    var b = 3;
    var c = 4;
    var d = 5;
    var k = 4.3F;

    b -= 1;
    println(b*a+c*d);
    d -= 1;

    println(a);
    a += 1;

    //println ((–2) * ( g – k ) +c); -> g is not defined in this, therefore invalid.

    println(c);
    c += 1;

    c += 1;
    println(c*a);
    a += 1;
  }
}
