import java.util.Scanner;

public class InterchangeValue {
    public static void main(String[] args) {
        int a; int b; int x;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Value of A :");
        a= s.nextInt();
        System.out.println("Enter value of B:");
        b=s.nextInt();
        x=a;
        a=b;
        b=x;
        System.out.println("Number of Value Interchange Successfully ");
        System.out.println( "A = "+a );
        System.out.println("B = "+b);



    }
}
