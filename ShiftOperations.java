
import java.util.Scanner;

public class ShiftOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter power of 2: ");
        int power = sc.nextInt();

        System.out.println("Multiplication = " + (n << power));
        System.out.println("Division = " + (n >> power));

        sc.close();
    }
}

