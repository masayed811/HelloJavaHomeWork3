import java.util.Scanner;

import static java.lang.System.out;

public class SymbolFuntion {
    public static void main(String[] args) {
        int a, b;
        Scanner f = new Scanner( System.in );
        {
            System.out.println( "Enter The 1st Number : " );
            a = f.nextInt();
            System.out.println( "Enter The 2st Number : " );
            b = f.nextInt();
            System.out.println( "Enter The Symbol : " );
            System.out.print( "Enter an operator (+, -, *, /): " );
            char operator = f.next().charAt( 0 );
            if (operator == '+') {
                System.out.println( a + b );
            }
            if (operator == '-') {
                System.out.println( " Result =" + (a - b) );
            }
            if (operator == '*') {
                System.out.println( " Result =" + (a * b) );
            }
            if (operator == '/') {
                System.out.println( " Result =" + (a / b) );
            }
        }
        }
    }
