    //Write a program to print the prime numbers between 1 to 999
import java.util.Scanner;
public class Prime_numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = 0;
        for(int n=1;n<=999;n++) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    f++;
                }
            }
            if (f == 2) {
                System.out.println(n + " is a Prime Number");
            }
            f=0;
        }

    }
}
 