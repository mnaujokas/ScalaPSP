import java.util.UUID

trait Serializer {
  def serialize:String = UUID.randomUUID.toString
  val serial:String = serialize
}
