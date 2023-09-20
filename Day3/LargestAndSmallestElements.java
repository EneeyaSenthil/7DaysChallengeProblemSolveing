// Write a Java program to find the largest and smallest elements in an array.
public class LargestAndSmallestElements {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 2};
        int largest = array[0];
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
