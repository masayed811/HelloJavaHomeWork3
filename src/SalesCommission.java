import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter Sales ID :" );
        int sales_ID = scan.nextInt();
        System.out.println( "Enter Seller's  Name  :" );
        String seller_name;
        seller_name = scan.next();
        System.out.println( "Enter Sales Amount :" );
        double Sales_Amount;
        ;
        Sales_Amount = scan.nextDouble();
        System.out.println( "Enter Basic Salery :" );
        int Basic_Salary;
        Basic_Salary = scan.nextInt();
        double Sales_commission;
        if (Sales_Amount >= 50000) {
            Sales_commission = Sales_Amount * 35 / 100;
            System.out.println( "Employee Sales Commission =  " + Sales_commission );
        } else if (Sales_Amount >= 30000 && Sales_Amount < 50000) {
            Sales_commission = Sales_Amount * 20 / 100;
            System.out.println( "Employee Sales Commission =  " + Sales_commission );
        } else if (Sales_Amount >= 10000 && Sales_Amount < 20000) {
            Sales_commission = Sales_Amount * 5 / 100;
            System.out.println( "Employee Sales Commission =  " + Sales_commission );
        } else if (Sales_Amount >= 0 && Sales_Amount < 10000) {
            Sales_commission = Sales_Amount * 2 / 100;
            System.out.println( "Employee Sales Commission =  " + Sales_commission );

        }
    }
}
