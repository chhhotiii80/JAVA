public class a1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 400, 50};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }
}
