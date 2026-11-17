
public class VisitorCounter {
    public static void main(String[] args) {
        int visitors = 0;

        System.out.println("Initial visitors: " + visitors);

        System.out.println("Visitor enters: " + ++visitors);
        System.out.println("Another visitor enters: " + visitors++);

        System.out.println("Visitors after entry: " + visitors);

        System.out.println("Visitor leaves: " + --visitors);
        System.out.println("Another visitor leaves: " + visitors--);

        System.out.println("Final visitors: " + visitors);
    }
}

