import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator");
        int num = sc.nextInt();
        System.out.println("Enter denominator");
        int den = sc.nextInt();

        try{
            int res = num/den;
            System.out.println("Result is : " + res);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero.");
        }
    }
}
