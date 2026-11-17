
import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        int count = 0;
        int number = n;

        while (number > 0) {
            count += number & 1;
            number = number >>> 1;
        }

        System.out.println("Number of set bits = " + count);
        sc.close();
    }
}
