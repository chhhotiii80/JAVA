public class OperatorsDemo {
    public static void main (String [] args) {

        int a = 10;
        int b = 3;

        //ARITHEMATIC OPERATORS
        
        System.out.println ("ARITHEMATIC OPERATORS");

        System.out.println ("Addition: " + (a+b));
        System.out.println ("Substraction: " + (a-b));
        System.out.println ("Multiplication: " + (a*b));
        System.out.println ("Division: " + (a/b));
        System.out.println ("Remainder: " + (a%b));


        //RELATIONAL OPERATORS

        System.out.println ("/nRELATIONAL OPERATORS");

        System.out.println ("a > b : " + (a > b));
        System.out.println ("a < b : " + (a < b));
        System.out.println ("a >= b : " + (a >= b));
        System.out.println ("a <= b : " + (a <= b));
        System.out.println ("a == b : " + (a == b));
        System.out.println ("a != b : " + (a != b));


        //LOGICAL OPERATORS

        boolean x = true;
        boolean y = false;

        System.out.println ("\nLOGICAL OPERATORS");

        System.out.println ("AND" + (x && y));
        System.out.println ("OR" + (x || y));
        System.out.println ("NOT" + (!x));
        
        
        //ASSIGNMENT OPERATORS

        int number = 5;

        System.out.println ("\nASSIGNMENT OPERATORS");

        System.out.println ("Initial value: " + number);
        number += 3;

        System.out.println ("After += 2: " + number);
        number -= 2;

        System.out.println ("After -= 2: " + number);
        number += 2;

        System.out.println ("After *= 2: " + number);
        number *= 2;

        System.out.println ("After /= 3: + number");
        number /= 3;

        
        //INCREMENT AND DECREMENT OPERATORS

        int count = 5;

        System.out.println ("\nINCREMENT AND DECREMENT");

        System.out.println ("original: " + count);
        count ++;

        System.out.println ("After increment: " + count);
        count --;

        System.out.println ("After decrement: " + count);


        //BITWISE OPERATORS

        int p = 5;
        int q = 3;

        System.out.println ("\nBITWISE OPERATORS");

        System.out.println ("p & q: " + (p & q));
        System.out.println ("p | q: " + (p | q));
        System.out.println ("p ^ q: " + (p ^ q));
        System.out.println ("p << q: " + (p << q));
        System.out.println ("p >> q: " + (p >> q));


        //CONDITIONAL OPERATORS

        int maximum = (a > b) ? a : b;
         System.out.println ("\nCONDITIONAL OPERATORS");

         System.out.println ("Maximum: " + maximum);


         //OPERATOR PRECEDENCE
         System.out.println ("\nOPERATOR PRECIDENCE");

         System.out.println ("2 + 3 * 4: " + (2 + 3 * 4));
         System.out.println ("(2 + 3) * 4: " + ((2 + 3) * 4));


    }
    
}
