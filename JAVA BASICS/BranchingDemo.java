
public class BranchingDemo {
    public static void main(String[] args) {

        // BREAK STATEMENT
        
        System.out.println("BREAK EXAMPLE");

        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }

            System.out.println(i);
        }

        // CONTINUE STATEMENT

        System.out.println("CONTINUE EXAMPLE");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }

        // RETURN STATEMENT

        System.out.println("RETURN EXAMPLE");

        displayMessage();

        System.out.println("Back in main method.");
    }

    static void displayMessage() {
        System.out.println("Inside displayMessage method.");
        return;
    }
}
