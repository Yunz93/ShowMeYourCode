object Solution141 {
  def hasCycle(head: ListNode): Boolean = {
    if (head == null || head.next == null) return false

    var slow: ListNode = head
    var fast: ListNode = head.next
    while (slow != fast) {
      if (fast == null || fast.next == null) return false

      slow = slow.next
      fast = fast.next.next
    }
    true
  }
}
