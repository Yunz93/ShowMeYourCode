class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

object Solution2 {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = (l1, l2) match {
    case (l1, null) => l1
    case (null, l2) => l2
    case (_, _) =>
      val d = (l1.x + l2.x) / 10
      val r = (l1.x + l2.x) % 10
      val ln = new ListNode(r)

      val next = if (d > 0)
        addTwoNumbers(new ListNode(1), addTwoNumbers(l1.next, l2.next))
      else
        addTwoNumbers(l1.next, l2.next)

      ln.next = next
      ln
  }
}
