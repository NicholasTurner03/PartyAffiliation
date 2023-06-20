import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Party;

        System.out.println("Please enter your Party Affiliation (D,R,I): ");
        Party = in.next();
        if ((Party.equalsIgnoreCase("R")) || (Party.equalsIgnoreCase("D")) || (Party.equalsIgnoreCase("I"))) {
            if (Party.equalsIgnoreCase("R")){
                System.out.println("You Get a Reblublican Elephant");
            }
            else if (Party.equalsIgnoreCase("D")){
                System.out.println("You get a Democratic Donkey");
            }
            else if (Party.equalsIgnoreCase("I")){
                System.out.println("You Choose Independent");
            }

        }
        else{
            System.out.print("You have chosen Other");
        }
    }
}
