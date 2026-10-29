public class CountWords {
    public static void main(String[] args) {

        String text = "Java is easy to learn";

        String trimmed = text.trim();

        int count;

        if (trimmed.isEmpty()) {
            count = 0;
        } else {
            count = trimmed.split("\\s+").length;
        }

        System.out.println("Text: " + text);
        System.out.println("Word count: " + count);
    }
}
