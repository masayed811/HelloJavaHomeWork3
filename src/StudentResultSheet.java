import java.util.Scanner;

public class StudentResultSheet {
    public static void main(String[] args) {

        double english;
        double math;
        double physics;

        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter the Student name:" );
        String name = scanner.next();
        System.out.println( "Enter the English Marks :" );
        english = scanner.nextDouble();
        System.out.println( "Enter the Physics Marks :" );
        physics = scanner.nextDouble();
        System.out.println( "Enter the Math Marks :" );
        math = scanner.nextDouble();
        double avaragepersentage = ((english + physics + math)*100 / 300);
        System.out.println( " Persentage of Total marks  :" + avaragepersentage +  "%");

        if (avaragepersentage < 35) {
           // if ( english<35 &&  physics <35&&  math<35) {
                System.out.println( "Result:Fail" );
            }

        else if (avaragepersentage >= 35 && avaragepersentage < 50)
            {
                System.out.println( "Result:Grade C " );
            }

             else if (avaragepersentage >= 50 && avaragepersentage < 60)
        {
            System.out.println( "Result:Grade B " );
        }
                    else if (avaragepersentage >= 60 && avaragepersentage < 80)
        {
            System.out.println( "Result:Grade A " );
        }
                            else if (avaragepersentage >= 80 && avaragepersentage < 100)
        {
            System.out.println( "Result:Grade A+ " );
        }
        }
    }
