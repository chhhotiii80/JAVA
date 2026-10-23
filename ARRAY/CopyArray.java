import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};

        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
    }
}
