public class EvenOddArray {
    public static void main(String[] args) {

        int[] numbers = {12, 7, 8, 15, 20, 33};

        System.out.println("Even numbers:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println("\nOdd numbers:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
