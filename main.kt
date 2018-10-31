import pointer.*
import kotlinx.cinterop.*

fun main(args: Array<String>) {
  memScoped {
    var ptr = alloc<PointerVar>()
    val int = alloc<IntVar>()
    val string = "hello".toUtf8()

    int.value = 1234

    InitPointer(ptr.ptr, int.ptr)
    PrintPointer(ptr.value, INT.toInt());

    string.usePinned { pinned ->
      InitPointer(ptr.ptr, pinned.addressOf(0))
      PrintPointer(ptr.value, STRING.toInt())
    }
  }
}
