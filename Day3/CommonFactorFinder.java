// Question 3: Find the largest common factor of two numbers.
public class CommonFactorFinder {
  public static void main(String[] args) {
    int num1 = 12;
    int num2 = 18;
    int largestCommonFactor = findLargestCommonFactor(num1, num2);
    System.out.println("The largest common factor is: " + largestCommonFactor);
  }

  public static int findLargestCommonFactor(int num1, int num2) {
    while (num2 != 0) {
      int temp = num2;
      num2 = num1 % num2;
      num1 = temp;
    }
    return num1;
  }
}