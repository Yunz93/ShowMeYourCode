object Solution1653 {
  def minimumDeletions(s: String): Int = {
    var f = 0
    var cntB = 0
    s.toArray.foreach(c => {
      if (c == 'b') {
        cntB += 1
      } else {
        f = Math.min(f + 1, cntB)
      }
    })
    f
  }
}
