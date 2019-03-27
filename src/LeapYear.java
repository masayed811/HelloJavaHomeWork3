import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Year");
        int year = scanner.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0)){
                      System.out.println("This Leap Year");}

                      else if ((year%4==0)&& (year%100==0)&&(year%400==0)){
            System.out.println(" This Is  Leap Year ");
            }

        else {
            System.out.println(" This Is Not Leap Year ");


            }
            }

        }
