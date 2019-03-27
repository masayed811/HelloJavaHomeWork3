import java.util.Scanner;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        Scanner alphab= new Scanner(System.in);
        System.out.println( "Enter  Alphabet : ");
        String alphabet = alphab.next();

        alphabet = alphabet.toLowerCase();
        System.out.println( "Result = " + alphabet);

    }
}
