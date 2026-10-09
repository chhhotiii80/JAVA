public class OneDimensionalArray {
    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 92, 88};

        System.out.println("First mark: " + marks[0]);
        System.out.println("Second mark: " + marks[1]);
        System.out.println("Third mark: " + marks[2]);

        System.out.println("Total elements: " + marks.length);

        System.out.println("All marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
