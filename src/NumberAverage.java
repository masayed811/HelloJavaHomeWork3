import java.util.Scanner;

public class NumberAverage {
    public static void main(String[] args) {
               Scanner s = new Scanner(System.in);
        int a,b,c,d,f; double average;
        System.out.println("Enter 1st Number :");
        a=s.nextInt();
        System.out.println("Enter 2ndt Number :");
        b=s.nextInt();
        System.out.println("Enter 3rd Number :");
        c=s.nextInt();
        System.out.println("Enter 4th Number :");
        d=s.nextInt();
        System.out.println("Enter 5th Number :");
        f=s.nextInt();
        average=(a+b+c+d+f)/5;
        System.out.println("The average of Five Numbers = "+average);



    }
}
