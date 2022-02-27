class NthToLast {
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
   * Space O(1)
   */
  ListNode nthToLast(ListNode head, int k) {
    ListNode run = head;
    ListNode walk = head;
    // Time O(n)
    for (int i = 0; i < k; i++) {
      if (run == null) return null;
      run = run.next;
    }

    // Time O(n)
    while (run != null) {
      run = run.next;
      walk = walk.next;
    }
    return walk;
  }
}