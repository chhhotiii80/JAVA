

public class TypeConversion {
    public static void main (String [] args) {

        //WIDENING CONVERSION (AUTOMATIC)
        int number = 100;
        double decimal = number;

        System.out.println ("Integer value: " + number);
        System.out.println ("Converted to double: " + decimal);

        //NARROWING CONVERSION (EXPLICIT CASTING)
        double price = 99.99;
        int wholePrice = (int) price;

        System.out.println ("Original double: " + price);
        System.out.println ("After casting to int: " + wholePrice);

        //CASTING BETWEEN NUMERIC TYPES
        int value = 130;
        byte smallValue = (byte) value;
        System.out.println ("Original integer: " + value);
        System.out.println ("After casting price: " + smallValue);

        //CHARACTER AND INTEGER CONVERSION
        char letter = 'A';
        int characterCode = letter;

        System.out.println ("Character: " + letter);
        System.out.println ("Character code: " + characterCode);

        //INTEGER DIVISION VERSUS DECIMAL DIVISION
        int a = 5;
        int b = 2;

        System.out.println ("Integer division: " + (a/b));
        System.out.println ("Decimal division: " + ((double) a/b));

    }
    
}
