final class Parent {
    final void display () {
        System.out.println ("This is a final method.");
    }
}

public class FinalKeywordDemo {
    public static void main (String [] args) {

        Parent obj = new Parent();
        obj.display();

        System.out.println ("Final class and method example.");
    }
    
}
