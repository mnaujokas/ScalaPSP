class OwnedTablet(name:String, ownersName:String) extends Tablet (name) with Owner {

  deviceName = own(ownersName, name)

}
