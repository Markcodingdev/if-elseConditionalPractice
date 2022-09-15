import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.equals("Hi")) {
            System.out.println("Hello There!");
        } else if (s.equals("Ligma")) {
            System.out.println("balls");
        } else System.out.println("Bye");

        /*  if (args) { conditional block;}
         */
            // Nested conditional
        // nested variables cannot be accessed outside of conditional block statement

        int x=5;

        if (x > 2){
            String nestedString = "x real big like";
            // if want to use nestedString in next conditional, must be converted to boolean.
            String nestedStringTwo;
            System.out.println(nestedString);
            boolean trueStatement = nestedString.equals(nestedString);
            System.out.println(trueStatement);
              //  boolean trueStatement = true;
// why is xLarge not printing? trueStatement outputs false. WHY???
            if (trueStatement) {
                    String xLarge = "SOOO BIG!";
                    System.out.println(xLarge);
                }

        } else {
            System.out.println("x smol ting"); }

    }

}