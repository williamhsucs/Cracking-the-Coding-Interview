class DeleteDups {
  class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
  /**
   * Time O(n)
   * Space O(n)
   */
  ListNode deleteDups(ListNode head) {
    // Space O(n)
    Set<Integer> set = new HashSet<>();
    ListNode node = head;
    ListNode pre = null;
    // Time O(n)
    while (node != null) {
      if (!set.contains(node.val)) {
        set.add(node.val);
        pre = node;
      } else {
        pre.next = node.next;
      }
      node = node.next;
    }
    return head;
  }
  /**
   * Time O(n^2)
   * Space O(1)
   */
  ListNode deleteDupsInPlace(ListNode head) {
    ListNode run = head;
    ListNode walk = head;
    while (walk != null) {
      run = walk;
      while (run.next != null) {
        if (walk.val == run.next.val) {
          run.next = run.next.next;
        } else {
          run = run.next;
        }
      }
      walk = walk.next;
    }
    return head;
  }
}