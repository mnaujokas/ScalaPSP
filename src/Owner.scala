trait Owner {

  def own(ownersName: String, deviceName: String): String = {
    ownersName + "'s " + deviceName
  }
}
