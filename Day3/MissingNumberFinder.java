//  Find the missing number in a sorted array.
public class MissingNumberFinder {
  public static void main(String[] args) {
    int[] sortedArray = {1, 2, 3, 4, 6, 7, 8};
    int missingNumber = findMissingNumber(sortedArray);
    System.out.println("The missing number is: " + missingNumber);
  }

  public static int findMissingNumber(int[] arr) {
    int n = arr.length;
    int total = (n + 1) * (n + 2) / 2;
    for (int num : arr) {
      total -= num;
    }
    return total;
  }
}
