class ReplaceSpaces {
  /**
   * Time O(n), where n is strLen
   * Space O(n), where n is length of new string
   */
  public String replaceSpaces(String str, int strLen) {
    StringBuilder newStr = new StringBuilder();
    for (int i = 0; i < strLen; i++) {
      if (str.charAt(i) == ' ') {
        newStr.append("%20%");
      } else {
        newStr.append(str.charAt(i));
      }
    }
    return newStr.toString();
  }
}