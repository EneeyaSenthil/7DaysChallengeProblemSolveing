//Write a program to find the factorial of given number.
import java.util.Scanner;
public class Factorial {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
System.out.println(" Enter the number ");
int num = scanner.nextInt();
int f = 1;
for (int i = 1; i<=num; i++)
{
f = f*i;
System.out.println(" The factorial of " + num + " is" + f);
}
}
}