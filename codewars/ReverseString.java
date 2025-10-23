public class ReverseString {
  public static String reverseWords(final String original) {
    String[] words = original.split("(?<=\\s)|(?=\\s)");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
      if (word.trim().isEmpty()) {
        result.append(word);
      } else {
        result.append(new StringBuilder(word).reverse());
      }
    }
    return result.toString();
  }
}