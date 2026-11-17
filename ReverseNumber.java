
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int number = Math.abs(n);
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (n < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed number = " + reverse);
        sc.close();
    }
}

