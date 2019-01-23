class OSTablet(name:String, ownersName:String) extends Tablet (name) with Owner with Serializer {
  deviceName = own(ownersName, name)
}