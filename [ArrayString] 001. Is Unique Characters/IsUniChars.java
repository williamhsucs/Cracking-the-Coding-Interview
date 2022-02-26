class IsUniChars {
  /**
   * Time O(n), where n is length of string
   * Space O(1)
   */
  boolean isUniChars(String str) {
    int check = 0;
    // Time O(n)
    for (int i = 0; i < str.length(); i++) {
      int val = str.charAt(i) - 'a';
      if ((check & (1 << val)) > 0) {
        return false;
      }
      check |= (1 << val);
    }
    return true;
  }
}