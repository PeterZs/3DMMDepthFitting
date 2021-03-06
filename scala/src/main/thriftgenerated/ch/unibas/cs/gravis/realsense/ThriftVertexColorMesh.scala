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


object ThriftVertexColorMesh extends ValidatingThriftStructCodec3[ThriftVertexColorMesh] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("ThriftVertexColorMesh")
  val VerticesField = new TField("vertices", TType.LIST, 1)
  val VerticesFieldManifest = implicitly[Manifest[Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D]]]
  val ColorField = new TField("color", TType.LIST, 2)
  val ColorFieldManifest = implicitly[Manifest[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]]]
  val FacesField = new TField("faces", TType.LIST, 3)
  val FacesFieldManifest = implicitly[Manifest[Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      VerticesField,
      false,
      true,
      VerticesFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[ch.unibas.cs.gravis.realsense.ThriftPoint3D]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ColorField,
      true,
      false,
      ColorFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[ch.unibas.cs.gravis.realsense.ThriftColor]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      FacesField,
      false,
      true,
      FacesFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]]),
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
  def validate(_item: ThriftVertexColorMesh): Unit = {
    if (_item.vertices == null) throw new TProtocolException("Required field vertices cannot be null")
    if (_item.faces == null) throw new TProtocolException("Required field faces cannot be null")
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: ThriftVertexColorMesh): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    if (item.vertices == null)
      buf += com.twitter.scrooge.validation.MissingRequiredField(fieldInfos.apply(0))
    buf ++= validateField(item.vertices)
    buf ++= validateField(item.color)
    if (item.faces == null)
      buf += com.twitter.scrooge.validation.MissingRequiredField(fieldInfos.apply(2))
    buf ++= validateField(item.faces)
    buf.toList
  }

  def withoutPassthroughFields(original: ThriftVertexColorMesh): ThriftVertexColorMesh =
    new Immutable(
      vertices =
        {
          val field = original.vertices
          field.map { field =>
            ch.unibas.cs.gravis.realsense.ThriftPoint3D.withoutPassthroughFields(field)
          }
        },
      color =
        {
          val field = original.color
          field.map { field =>
            field.map { field =>
              ch.unibas.cs.gravis.realsense.ThriftColor.withoutPassthroughFields(field)
            }
          }
        },
      faces =
        {
          val field = original.faces
          field.map { field =>
            ch.unibas.cs.gravis.realsense.ThriftTriangleCell.withoutPassthroughFields(field)
          }
        }
    )

  override def encode(_item: ThriftVertexColorMesh, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): ThriftVertexColorMesh = {

    var vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D] = Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D]()
    var _got_vertices = false
    var color: Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]] = None
    var faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell] = Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]()
    var _got_faces = false

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
              case TType.LIST =>
    
                vertices = readVerticesValue(_iprot)
                _got_vertices = true
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'vertices' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.LIST =>
    
                color = Some(readColorValue(_iprot))
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'color' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.LIST =>
    
                faces = readFacesValue(_iprot)
                _got_faces = true
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'faces' (expected=%s, actual=%s).".format(
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

    if (!_got_vertices) throw new TProtocolException("Required field 'vertices' was not found in serialized data for struct ThriftVertexColorMesh")
    if (!_got_faces) throw new TProtocolException("Required field 'faces' was not found in serialized data for struct ThriftVertexColorMesh")
    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      vertices,
      color,
      faces,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): ThriftVertexColorMesh =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[realsense] def eagerDecode(_iprot: TProtocol): ThriftVertexColorMesh = {
    var vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D] = Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D]()
    var _got_vertices = false
    var color: _root_.scala.Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]] = _root_.scala.None
    var faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell] = Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]()
    var _got_faces = false
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
              case TType.LIST =>
                vertices = readVerticesValue(_iprot)
                _got_vertices = true
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'vertices' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.LIST =>
                color = _root_.scala.Some(readColorValue(_iprot))
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'color' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.LIST =>
                faces = readFacesValue(_iprot)
                _got_faces = true
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'faces' (expected=%s, actual=%s).".format(
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

    if (!_got_vertices) throw new TProtocolException("Required field 'vertices' was not found in serialized data for struct ThriftVertexColorMesh")
    if (!_got_faces) throw new TProtocolException("Required field 'faces' was not found in serialized data for struct ThriftVertexColorMesh")
    new Immutable(
      vertices,
      color,
      faces,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D] = Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D](),
    color: _root_.scala.Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]] = _root_.scala.None,
    faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell] = Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]()
  ): ThriftVertexColorMesh =
    new Immutable(
      vertices,
      color,
      faces
    )

  def unapply(_item: ThriftVertexColorMesh): _root_.scala.Option[_root_.scala.Tuple3[Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D], Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]], Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]]] = _root_.scala.Some(_item.toTuple)


  @inline private[realsense] def readVerticesValue(_iprot: TProtocol): Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[ch.unibas.cs.gravis.realsense.ThriftPoint3D](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          ch.unibas.cs.gravis.realsense.ThriftPoint3D.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeVerticesField(vertices_item: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(VerticesField)
    writeVerticesValue(vertices_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeVerticesValue(vertices_item: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, vertices_item.size))
    vertices_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = vertices_item.size
        while (_i < _size) {
          val vertices_item_element = vertices_item(_i)
          vertices_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        vertices_item.foreach { vertices_item_element =>
          vertices_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }

  @inline private[realsense] def readColorValue(_iprot: TProtocol): Seq[ch.unibas.cs.gravis.realsense.ThriftColor] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[ch.unibas.cs.gravis.realsense.ThriftColor](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          ch.unibas.cs.gravis.realsense.ThriftColor.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeColorField(color_item: Seq[ch.unibas.cs.gravis.realsense.ThriftColor], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ColorField)
    writeColorValue(color_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeColorValue(color_item: Seq[ch.unibas.cs.gravis.realsense.ThriftColor], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, color_item.size))
    color_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = color_item.size
        while (_i < _size) {
          val color_item_element = color_item(_i)
          color_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        color_item.foreach { color_item_element =>
          color_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }

  @inline private[realsense] def readFacesValue(_iprot: TProtocol): Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[ch.unibas.cs.gravis.realsense.ThriftTriangleCell](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          ch.unibas.cs.gravis.realsense.ThriftTriangleCell.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeFacesField(faces_item: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(FacesField)
    writeFacesValue(faces_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeFacesValue(faces_item: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, faces_item.size))
    faces_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = faces_item.size
        while (_i < _size) {
          val faces_item_element = faces_item(_i)
          faces_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        faces_item.foreach { faces_item_element =>
          faces_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }


  object Immutable extends ThriftStructCodec3[ThriftVertexColorMesh] {
    override def encode(_item: ThriftVertexColorMesh, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): ThriftVertexColorMesh = ThriftVertexColorMesh.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[ThriftVertexColorMesh] = ThriftVertexColorMesh.metaData
  }

  /**
   * The default read-only implementation of ThriftVertexColorMesh.  You typically should not need to
   * directly reference this class; instead, use the ThriftVertexColorMesh.apply method to construct
   * new instances.
   */
  class Immutable(
      val vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D],
      val color: _root_.scala.Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]],
      val faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ThriftVertexColorMesh {
    def this(
      vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D] = Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D](),
      color: _root_.scala.Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]] = _root_.scala.None,
      faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell] = Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]()
    ) = this(
      vertices,
      color,
      faces,
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
      val vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D],
      val color: _root_.scala.Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]],
      val faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ThriftVertexColorMesh {

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
   * This Proxy trait allows you to extend the ThriftVertexColorMesh trait with additional state or
   * behavior and implement the read-only methods from ThriftVertexColorMesh using an underlying
   * instance.
   */
  trait Proxy extends ThriftVertexColorMesh {
    protected def _underlying_ThriftVertexColorMesh: ThriftVertexColorMesh
    override def vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D] = _underlying_ThriftVertexColorMesh.vertices
    override def color: _root_.scala.Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]] = _underlying_ThriftVertexColorMesh.color
    override def faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell] = _underlying_ThriftVertexColorMesh.faces
    override def _passthroughFields = _underlying_ThriftVertexColorMesh._passthroughFields
  }
}

/**
 * Prefer the companion object's [[ch.unibas.cs.gravis.realsense.ThriftVertexColorMesh.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait ThriftVertexColorMesh
  extends ThriftStruct
  with _root_.scala.Product3[Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D], Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]], Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]]
  with ValidatingThriftStruct[ThriftVertexColorMesh]
  with java.io.Serializable
{
  import ThriftVertexColorMesh._

  def vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D]
  def color: _root_.scala.Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]]
  def faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = vertices
  def _2 = color
  def _3 = faces

  def toTuple: _root_.scala.Tuple3[Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D], Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]], Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]] = {
    (
      vertices,
      color,
      faces
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
              if (vertices ne null) {
                writeVerticesValue(vertices, _oprot)
                _root_.scala.Some(ThriftVertexColorMesh.VerticesField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (color.isDefined) {
                writeColorValue(color.get, _oprot)
                _root_.scala.Some(ThriftVertexColorMesh.ColorField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (faces ne null) {
                writeFacesValue(faces, _oprot)
                _root_.scala.Some(ThriftVertexColorMesh.FacesField)
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
  def setField(_blob: TFieldBlob): ThriftVertexColorMesh = {
    var vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D] = this.vertices
    var color: _root_.scala.Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]] = this.color
    var faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell] = this.faces
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        vertices = readVerticesValue(_blob.read)
      case 2 =>
        color = _root_.scala.Some(readColorValue(_blob.read))
      case 3 =>
        faces = readFacesValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      vertices,
      color,
      faces,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): ThriftVertexColorMesh = {
    var vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D] = this.vertices
    var color: _root_.scala.Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]] = this.color
    var faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell] = this.faces

    _fieldId match {
      case 1 =>
        vertices = Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D]()
      case 2 =>
        color = _root_.scala.None
      case 3 =>
        faces = Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell]()
      case _ =>
    }
    new Immutable(
      vertices,
      color,
      faces,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetVertices: ThriftVertexColorMesh = unsetField(1)

  def unsetColor: ThriftVertexColorMesh = unsetField(2)

  def unsetFaces: ThriftVertexColorMesh = unsetField(3)


  override def write(_oprot: TProtocol): Unit = {
    ThriftVertexColorMesh.validate(this)
    _oprot.writeStructBegin(Struct)
    if (vertices ne null) writeVerticesField(vertices, _oprot)
    if (color.isDefined) writeColorField(color.get, _oprot)
    if (faces ne null) writeFacesField(faces, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    vertices: Seq[ch.unibas.cs.gravis.realsense.ThriftPoint3D] = this.vertices,
    color: _root_.scala.Option[Seq[ch.unibas.cs.gravis.realsense.ThriftColor]] = this.color,
    faces: Seq[ch.unibas.cs.gravis.realsense.ThriftTriangleCell] = this.faces,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): ThriftVertexColorMesh =
    new Immutable(
      vertices,
      color,
      faces,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[ThriftVertexColorMesh]

  private def _equals(x: ThriftVertexColorMesh, y: ThriftVertexColorMesh): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator)

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[ThriftVertexColorMesh]) &&
      _passthroughFields == other.asInstanceOf[ThriftVertexColorMesh]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 3

  override def productElement(n: Int): Any = n match {
    case 0 => this.vertices
    case 1 => this.color
    case 2 => this.faces
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "ThriftVertexColorMesh"

  def _codec: ValidatingThriftStructCodec3[ThriftVertexColorMesh] = ThriftVertexColorMesh
}

