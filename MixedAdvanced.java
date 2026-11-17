
import java.util.Scanner;

public class MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check power of 4 using bitwise and shift operators
        boolean powerOf4 = false;
        int temp = n;

        if (temp > 0 && (temp & (temp - 1)) == 0) {
            while (temp > 1 && (temp & 3) == 0) {
                temp >>= 2;
            }
            powerOf4 = (temp == 1);
        }

        System.out.println("Is power of 4: " + powerOf4);

        // Toggle the 3rd bit (counting from the right, starting at bit 0)
        int toggled = n ^ (1 << 2);
        System.out.println("After toggling 3rd bit: " + toggled);

        // Multiplication table, skipping multiples of 6
        for (int i = 1; i <= 20; i++) {
            int product = n * i;

            if (product % 48 == 0) {
                System.out.println("Stopped at multiple of 48: " + product);
                break;
            }

            if (product % 6 == 0) {
                continue;
            }

            System.out.println(n + " x " + i + " = " + product);
        }

        sc.close();
    }
}

