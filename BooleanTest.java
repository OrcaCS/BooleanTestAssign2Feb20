import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n\nPlease enter an A value (true/false): ");
        boolean a = keyboard.nextBoolean();
        System.out.println("\n\nPlease enter a B value (true/false): ");
        boolean b = keyboard.nextBoolean();
        System.out.println("\n\nPlease enter an C value (true/false): ");
        boolean c = keyboard.nextBoolean();
        System.out.println("\n\nPlease enter a D value (true/false): ");
        boolean d = keyboard.nextBoolean();
        keyboard.close();

        boolean status = b && !d || !b && !c && d || !a && !b && !c || a && c && !d;

        System.out.println("\n Your boolean status is: " + status);
    }
}
