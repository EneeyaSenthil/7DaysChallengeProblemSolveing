//Write a program to find the fibonacci series of given number.
import java.util.Scanner;
public class Fibonacci {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
System.out.println(" Enter the number ");
int num = scanner.nextInt();
int a = -1, b = 1, c;
for (int i = 0; i<num; i++)
{
c = a+b;
System.out.println(c); 
a = b;
b = c;
}
}
}