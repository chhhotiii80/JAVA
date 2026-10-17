public class StringMethods {
    public static void main(String[] args) {

        String text = "Learn Java";

        System.out.println(text.length());
        System.out.println(text.substring(6));
        System.out.println(text.contains("Java"));
        System.out.println(text.replace("Java", "Programming"));
        System.out.println(text.equals("Learn Java"));
    }
}