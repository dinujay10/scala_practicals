object VolumeOfSphere{
  def volume(radius: Double): Double = radius*radius*radius*(4.0/3.0)*3.14
  def main(args:Array[String]):Unit = println("Volume of the sphere is : "+volume(5))
}
