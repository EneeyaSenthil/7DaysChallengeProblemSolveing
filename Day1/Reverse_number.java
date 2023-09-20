    //Write a program to find the reverse of N digit Number
import java.util.Scanner;
public class  Reverse_number {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
System.out.println(" Enter the number ");
int num = scanner.nextInt();
int reverse = 0, remainder;
while(num!=0)
        {
remainder=num%10;
reverse=(reverse*10)+remainder;
num=num/10;
}
System.out.println("Reversed Number: "+reverse);
}
}

