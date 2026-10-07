
public class DecisionStatements {
    public static void main(String[] args) {

        // SIMPLE IF STATEMENT
        
        int number = 10;

        if (number > 0) 
            {
            System.out.println("Number is positive");
        }

        // IF ELSE STATEMENT

        int age = 17;

        if (age >= 18) 
            {
            System.out.println("Eligible by age");
        }
         else 
            {
            System.out.println("Not eligible by age");
        }

        // ELSE IF LADDER

        int marks = 82;

        if (marks >= 90) 
            {
            System.out.println("Grade: A");
        }
        else if (marks >= 75) 
            {
            System.out.println("Grade: B");
        } 
        else if (marks >= 60) 
            {
            System.out.println("Grade: C");
        } 
        else 
            {
            System.out.println("Grade: D");
        }

        // NESTED IF STATEMENT

        int ageForEntry = 20;
        boolean hasTicket = true;

        if (ageForEntry >= 18) 
            {
            if (hasTicket)
                 {
                System.out.println("Entry allowed");
            } 
            else 
                {
                System.out.println("Ticket required");
            }
        } 
        else 
            {
            System.out.println("Entry condition not met");
        }
    }
}
