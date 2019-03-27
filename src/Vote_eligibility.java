import java.util.Scanner;

public class Vote_eligibility {

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter age: ");
            int age=s.nextInt();
            if(age>=18){
                System.out.println("is eligible for Vote"); }
            else {
                System.out.println(" Not eligible for Vote"); }
            }
        }

