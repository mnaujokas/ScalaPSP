class OSCTablet (name:String, ownersName:String, batteryVoltage:Double) extends Tablet (name) with Owner with Serializer with ChargeEstimator {
  deviceName = own(ownersName, name)
  setVoltage(batteryVoltage)
}