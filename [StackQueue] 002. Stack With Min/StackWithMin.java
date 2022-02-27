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