public class ConstantsDemo {
    public static void main (String [] args) {

        //CONSTANT VALUES
        final double PI = 3.14159;
        final int DAYS_IN_WEEK = 7;

        //REGULAR VARIABLE
        int radius = 5;
        
        //CALCULATE CIRCLE AREA
        double area = PI * radius * radius ;

        System.out.println ("Value of PI: "  + PI);
        System.out.println ("Days in a week: " + DAYS_IN_WEEK);
        System.out.println ("Radius: " + radius);
        System.out.println ("Area of circle: " + area);

        //A REGULAR VARIABLE CAN BE CHANGED 
        radius = 10;

        double newArea = PI * radius * radius;
        System.out.println ("Updated radius: "  + radius);
        System.out.println ("New area: "  + newArea);



    }

    
}
