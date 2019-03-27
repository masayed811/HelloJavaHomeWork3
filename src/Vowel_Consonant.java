import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {

        Scanner alphab= new Scanner(System.in);
        System.out.println( "Enter  Alphabet : ");
        char alphabet = alphab.next().charAt(0);

        if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'||alphabet=='A'||alphabet=='E'
                ||alphabet=='I'||alphabet=='O'||alphabet=='U')
        {
            System.out.println("Expected Output : Vowel    "    +
                        "Entered character "+alphabet+" is  Vowel");
        }
        else if((alphabet>='a'&&alphabet<='z')||(alphabet>='A'&&alphabet<='Z'))
            System.out.println("Expected Output : Consonant" +
                    "Entered character     9" +
                    +alphabet+" is Consonant");
        else
            System.out.println("Not an alphabet");


    }
}
