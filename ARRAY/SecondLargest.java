public class SecondLargest {
    public static void main(String[] args) {

        int[] numbers = {10, 40, 20, 40, 60};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            int value = numbers[i];

            if (value > largest) {
                second = largest;
                largest = value;
            } else if (value < largest && value > second) {
                second = value;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second-largest distinct value.");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}
