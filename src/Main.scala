

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    var tablet:OSCTablet = new OSCTablet("mipad","Benas", 3.7)
    println(new OwnedTablet("ipadas","Aurimo").getDeviceName)
    println(new OSTablet("ipadas","Aurimo").serial)
    println(tablet.calculateBatteryPercentage()+"%")
  }

}
