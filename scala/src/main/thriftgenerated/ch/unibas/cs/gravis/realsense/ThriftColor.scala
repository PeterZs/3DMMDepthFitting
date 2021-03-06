/**
 * Generated by Scrooge
 *   version: 18.4.0
 *   rev: b64bcb47af2451b2e51a1ed1b3876f6c06c642b3
 *   built at: 20180410-144039
 */
package ch.unibas.cs.gravis.realsense

import com.twitter.io.Buf
import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob,
  ThriftException,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ThriftUtil,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3
}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport, TIOStreamTransport}
import java.io.ByteArrayInputStream
import java.nio.ByteBuffer
import java.util.Arrays
import java.util.concurrent.atomic.AtomicInteger
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object ThriftColor extends ValidatingThriftStructCodec3[ThriftColor] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("ThriftColor")
  val RField = new TField("r", TType.I16, 1)
  val RFieldManifest = implicitly[Manifest[Short]]
  val GField = new TField("g", TType.I16, 2)
  val GFieldManifest = implicitly[Manifest[Short]]
  val BField = new TField("b", TType.I16, 3)
  val BFieldManifest = implicitly[Manifest[Short]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      RField,
      false,
      true,
      RFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      GField,
      false,
      true,
      GFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      BField,
      false,
      true,
      BFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: ThriftColor): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: ThriftColor): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.r)
    buf ++= validateField(item.g)
    buf ++= validateField(item.b)
    buf.toList
  }

  def withoutPassthroughFields(original: ThriftColor): ThriftColor =
    new Immutable(
      r =
        {
          val field = original.r
          field
        },
      g =
        {
          val field = original.g
          field
        },
      b =
        {
          val field = original.b
          field
        }
    )

  override def encode(_item: ThriftColor, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): ThriftColor = {

    var r: Short = 0
    var _got_r = false
    var g: Short = 0
    var _got_g = false
    var b: Short = 0
    var _got_b = false

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.I16 =>
    
                r = readRValue(_iprot)
                _got_r = true
              case _actualType =>
                val _expectedType = TType.I16
                throw new TProtocolException(
                  "Received wrong type for field 'r' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.I16 =>
    
                g = readGValue(_iprot)
                _got_g = true
              case _actualType =>
                val _expectedType = TType.I16
                throw new TProtocolException(
                  "Received wrong type for field 'g' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I16 =>
    
                b = readBValue(_iprot)
                _got_b = true
              case _actualType =>
                val _expectedType = TType.I16
                throw new TProtocolException(
                  "Received wrong type for field 'b' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    if (!_got_r) throw new TProtocolException("Required field 'r' was not found in serialized data for struct ThriftColor")
    if (!_got_g) throw new TProtocolException("Required field 'g' was not found in serialized data for struct ThriftColor")
    if (!_got_b) throw new TProtocolException("Required field 'b' was not found in serialized data for struct ThriftColor")
    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      r,
      g,
      b,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): ThriftColor =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[realsense] def eagerDecode(_iprot: TProtocol): ThriftColor = {
    var r: Short = 0
    var _got_r = false
    var g: Short = 0
    var _got_g = false
    var b: Short = 0
    var _got_b = false
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.I16 =>
                r = readRValue(_iprot)
                _got_r = true
              case _actualType =>
                val _expectedType = TType.I16
                throw new TProtocolException(
                  "Received wrong type for field 'r' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.I16 =>
                g = readGValue(_iprot)
                _got_g = true
              case _actualType =>
                val _expectedType = TType.I16
                throw new TProtocolException(
                  "Received wrong type for field 'g' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I16 =>
                b = readBValue(_iprot)
                _got_b = true
              case _actualType =>
                val _expectedType = TType.I16
                throw new TProtocolException(
                  "Received wrong type for field 'b' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    if (!_got_r) throw new TProtocolException("Required field 'r' was not found in serialized data for struct ThriftColor")
    if (!_got_g) throw new TProtocolException("Required field 'g' was not found in serialized data for struct ThriftColor")
    if (!_got_b) throw new TProtocolException("Required field 'b' was not found in serialized data for struct ThriftColor")
    new Immutable(
      r,
      g,
      b,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    r: Short,
    g: Short,
    b: Short
  ): ThriftColor =
    new Immutable(
      r,
      g,
      b
    )

  def unapply(_item: ThriftColor): _root_.scala.Option[_root_.scala.Tuple3[Short, Short, Short]] = _root_.scala.Some(_item.toTuple)


  @inline private[realsense] def readRValue(_iprot: TProtocol): Short = {
    _iprot.readI16()
  }

  @inline private def writeRField(r_item: Short, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(RField)
    writeRValue(r_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeRValue(r_item: Short, _oprot: TProtocol): Unit = {
    _oprot.writeI16(r_item)
  }

  @inline private[realsense] def readGValue(_iprot: TProtocol): Short = {
    _iprot.readI16()
  }

  @inline private def writeGField(g_item: Short, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(GField)
    writeGValue(g_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeGValue(g_item: Short, _oprot: TProtocol): Unit = {
    _oprot.writeI16(g_item)
  }

  @inline private[realsense] def readBValue(_iprot: TProtocol): Short = {
    _iprot.readI16()
  }

  @inline private def writeBField(b_item: Short, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(BField)
    writeBValue(b_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeBValue(b_item: Short, _oprot: TProtocol): Unit = {
    _oprot.writeI16(b_item)
  }


  object Immutable extends ThriftStructCodec3[ThriftColor] {
    override def encode(_item: ThriftColor, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): ThriftColor = ThriftColor.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[ThriftColor] = ThriftColor.metaData
  }

  /**
   * The default read-only implementation of ThriftColor.  You typically should not need to
   * directly reference this class; instead, use the ThriftColor.apply method to construct
   * new instances.
   */
  class Immutable(
      val r: Short,
      val g: Short,
      val b: Short,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ThriftColor {
    def this(
      r: Short,
      g: Short,
      b: Short
    ) = this(
      r,
      g,
      b,
      Map.empty[Short, TFieldBlob]
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      val r: Short,
      val g: Short,
      val b: Short,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ThriftColor {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }


    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the ThriftColor trait with additional state or
   * behavior and implement the read-only methods from ThriftColor using an underlying
   * instance.
   */
  trait Proxy extends ThriftColor {
    protected def _underlying_ThriftColor: ThriftColor
    override def r: Short = _underlying_ThriftColor.r
    override def g: Short = _underlying_ThriftColor.g
    override def b: Short = _underlying_ThriftColor.b
    override def _passthroughFields = _underlying_ThriftColor._passthroughFields
  }
}

/**
 * Prefer the companion object's [[ch.unibas.cs.gravis.realsense.ThriftColor.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait ThriftColor
  extends ThriftStruct
  with _root_.scala.Product3[Short, Short, Short]
  with ValidatingThriftStruct[ThriftColor]
  with java.io.Serializable
{
  import ThriftColor._

  def r: Short
  def g: Short
  def b: Short

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = r
  def _2 = g
  def _3 = b

  def toTuple: _root_.scala.Tuple3[Short, Short, Short] = {
    (
      r,
      g,
      b
    )
  }


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (true) {
                writeRValue(r, _oprot)
                _root_.scala.Some(ThriftColor.RField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (true) {
                writeGValue(g, _oprot)
                _root_.scala.Some(ThriftColor.GField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (true) {
                writeBValue(b, _oprot)
                _root_.scala.Some(ThriftColor.BField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            _root_.scala.Some(TFieldBlob(_field, Buf.ByteArray.Owned(_buff.getArray())))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): ThriftColor = {
    var r: Short = this.r
    var g: Short = this.g
    var b: Short = this.b
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        r = readRValue(_blob.read)
      case 2 =>
        g = readGValue(_blob.read)
      case 3 =>
        b = readBValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      r,
      g,
      b,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): ThriftColor = {
    var r: Short = this.r
    var g: Short = this.g
    var b: Short = this.b

    _fieldId match {
      case 1 =>
        r = 0
      case 2 =>
        g = 0
      case 3 =>
        b = 0
      case _ =>
    }
    new Immutable(
      r,
      g,
      b,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetR: ThriftColor = unsetField(1)

  def unsetG: ThriftColor = unsetField(2)

  def unsetB: ThriftColor = unsetField(3)


  override def write(_oprot: TProtocol): Unit = {
    ThriftColor.validate(this)
    _oprot.writeStructBegin(Struct)
    writeRField(r, _oprot)
    writeGField(g, _oprot)
    writeBField(b, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    r: Short = this.r,
    g: Short = this.g,
    b: Short = this.b,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): ThriftColor =
    new Immutable(
      r,
      g,
      b,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[ThriftColor]

  private def _equals(x: ThriftColor, y: ThriftColor): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator)

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[ThriftColor]) &&
      _passthroughFields == other.asInstanceOf[ThriftColor]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 3

  override def productElement(n: Int): Any = n match {
    case 0 => this.r
    case 1 => this.g
    case 2 => this.b
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "ThriftColor"

  def _codec: ValidatingThriftStructCodec3[ThriftColor] = ThriftColor
}

