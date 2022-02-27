class IsPermutationOfPalindrome {
  /**
   * Time O(n), where n is length of string.
   * Space O(1)
   */
  public boolean isPermutationOfPalindrome(String str) {
    // Space O(26) -> O(1)
    int[] bucket = new int[26];
    // Time O(n)
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') continue;
      int idx = 0;
      if ((str.charAt(i) - 'a') >= 0 && (str.charAt(i) - 'a' <= 26)) {
        idx = str.charAt(i) - 'a';
      } else {
        idx = str.charAt(i) - 'A';
      }
      bucket[idx]++;
    }

    boolean existOne = false;
    // Time O(n)
    for (int i : bucket) {
      if (i % 2 == 1) {
        if (existOne) {
          return false;
        }
        existOne = true;
      }
    }
    return true;
  }
}

class IsPermutationOfPalindromeBinary {
  /**
   * Time O(n), where n is length of string.
   * Space O(1)
   */
  public boolean isPermutationOfPalindrome(String str) {
    int bucket = 0;
    // Time O(n)
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') continue;
      int idx = 0;
      if ((str.charAt(i) - 'a') >= 0 && (str.charAt(i) - 'a' <= 26)) {
        idx = str.charAt(i) - 'a';
      } else {
        idx = str.charAt(i) - 'A';
      }
      bucket ^= (1 << idx);
    }

    return (bucket == 0) || ((bucket & (bucket - 1)) == 0);
  }
}