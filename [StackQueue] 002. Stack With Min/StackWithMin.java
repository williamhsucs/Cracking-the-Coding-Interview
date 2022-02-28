class NodeWithMin {
  int val;
  int min;
  public NodeWithMin(int val, int min) {
    this.val = val;
    this.min = min;
  }
}
/**
 * push, pop, min: Time O(1)
 * Space O(n), for each node stores a min value.
 */
class StackWithMin extends Stack<NodeWithMin> {
  // Time O(1)
  public int min() {
    return this.isEmpty() ? Integer.MAX_VALUE : peek().min;
  }

  // Time O(1)
  public void push(int val) {
    int min = Math.min(val, min());
    super.push(new NodeWithMin(val, min));
  }
}
/**
 * push, pop, min: Time O(1)
 * Space O(n), only stores value while push value smaller than current min value.
 */
class StackWithMin2 extends Stack<NodeWithMin> {
  // Space O(n)
  Stack<Integer> minStack;
  public StackWithMin2() {
    minStack = new Stack<>();
  }
  // Time O(1)
  public int min() {
    return this.isEmpty() ? Integer.MAX_VALUE : peek().min;
  }

  // Time O(1)
  public void push(int val) {
    int min = Math.min(val, min());
    super.push(new NodeWithMin(val, min));
  }
}