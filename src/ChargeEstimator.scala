trait ChargeEstimator {
  var currentVoltage:Double = 3.2
  def setVoltage(batteryVoltage:Double): Unit= {
    currentVoltage = batteryVoltage
  }

  def calculateBatteryPercentage(): Int = {
    val result = 100 * (1 - (4.2 - currentVoltage))
    result.toInt
  }

}
