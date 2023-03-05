import scala.collection.mutable

object Solution1487 {
  def getFolderNames(names: Array[String]): Array[String] = {
    val set = new mutable.LinkedHashSet[String]()
    names.foreach(n => {
      if (set.contains(n)) {
        var minIndex = 1
        while (set.contains(s"$n($minIndex)")) {
          minIndex += 1
        }
        set.add(s"$n($minIndex)")
      } else {
        set.add(n)
      }
    })
    set.toArray
  }
}
