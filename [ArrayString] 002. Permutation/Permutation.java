class Permutation1 {
  /**
   * Time O(n)
   * Space O(n)
   */
  boolean permutation(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    /**
     * Time O(n)
     * Space O(n)
     */
    return sort(s1).equals(sort(s2));
  }

  /**
   * Time O(n), where n is length of string
   * Space O(n), where n is length of string
   */
  String sort(String s) {
    char[] ary = s.toCharArray();
    Arrays.sort(ary);
    return new String(ary);
  }
}

class Permutation2 {
  /**
   * Time O(n), where n is length of string1
   * Space O(1), because the space usage is fixed.
   */
  boolean permutation(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    // Space O(26) -> Space O(1)
    int[] bucket = new int[26];
    // Time O(n)
    for (int i = 0; i < s1.length(); i++) {
      bucket[s1.charAt(i) - 'a']++;
    }
    // Time O(m)
    for (int i = 0; i < s2.length(); i++) {
      bucket[s2.charAt(i) - 'a']--;
      if (bucket[s2.charAt(i) - 'a'] < 0) {
        return false;
      }
    }
    return true;
  }
}

class PermutationRemove {
  /**
   * Time O(n^2 * s)
   * Space O(n)
   */
  List<String> remove(List<String> texts) {
    // Space O(n)
    List<String> res = new ArrayList<>();
    // Time O(n^2 * s)
    for (String text : texts) {
      if (!res.contains(text)) {
        boolean isPermutation = false;
        for (String r : res) {
          // Time O(s), where n is length of text
          if (permutation(text, r)) {
            isPermutation = true;
            break;
          }
        }
        if (!isPermutation) {
          res.add(text);
        }
      }
    }
  }
  boolean permutation(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    int[] bucket = new int[26];
    for (int i = 0; i < s1.length(); i++) {
      bucket[s1.charAt(i) - 'a']++;
    }
    for (int i = 0; i < s2.length(); i++) {
      bucket[s2.charAt(i) - 'a']--;
      if (bucket[s2.charAt(i) - 'a'] < 0) return false;
    }
    return true;
  }
}
