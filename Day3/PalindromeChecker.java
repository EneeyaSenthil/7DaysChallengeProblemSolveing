// Check if a string is a palindrome.
public class PalindromeChecker {
  public static void main(String[] args) {
    String str = "racecar";
    boolean isPalindrome = isPalindrome(str);
    System.out.println("Is the string a palindrome? " + isPalindrome);
  }

  public static boolean isPalindrome(String str) {
    int i = 0, j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
