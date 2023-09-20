//Write a program to find the sum and average of given n numbers.
import java.util.Scanner;
public class FindingSum_avg {
public static void main(String args []) {
Scanner scanner = new Scanner(System.in);
System.out.println(" Howmuch numbers do you want to enter? ");
int num = scanner.nextInt();
int sum = 0;
for (int i = 0; i <num; i++) {
System.out.println(" Enter the number " + (i+1));
int Input = scanner.nextInt();
sum += Input;
}
System.out.println(" the sum is " + sum);
System.out.println(" The average is " + sum/num);
}
}