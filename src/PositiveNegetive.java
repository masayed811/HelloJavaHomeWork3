import java.util.Scanner;

public class PositiveNegetive {
    public static void main(String[] args) {
        int N;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number for Check :");
        N=s.nextInt();
        if( N < 0 ){
            System.out.println("The Number  "+N+   "  is Negetive " );
                    }
        else if ( N ==0 ){ System.out.println("The Number  "+N+    "  is Zero " ); }
        else if ( N > 0 ){
            System.out.println("The Number  "+N+   "  is Positive " );
        }
    }
}
