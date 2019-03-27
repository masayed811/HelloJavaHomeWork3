import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        int ID =s.nextInt();
        System.out.println("Enter Employee Name:");
        String name = s.next();
        System.out.println("Enter The Basic Salary : ");
        double bsalary =s.nextDouble();
        double HRA, DA,TA, PF, Gsalary;
  HRA= bsalary*10/100;
  System.out.println("Employee HRA = " +HRA);
  DA= bsalary*8/100;
        System.out.println("Employee DA = "+DA);
TA=bsalary*9/100;
System.out.println("Employee TA = "+TA);
  PF= bsalary*20/100;
        System.out.println("Employee PF = "+PF);
        Gsalary=(bsalary+HRA+DA+TA)-PF;
        System.out.println("Employee Gross Salary  = "+Gsalary);
    }
}
