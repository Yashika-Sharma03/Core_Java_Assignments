import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String args[]) throws UnsupportedOperationException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator");
        int num = sc.nextInt();
        System.out.println("Enter denominator");
        int den = sc.nextInt();
        int res = 0;
        sc.close();

        try{
            if(den==0){
                throw new UnsupportedOperationException("Denominator should not be zero.");
            }
            res = num/den;
            System.out.println("Result is : " + res);
        }
        catch(UnsupportedOperationException e){
            System.out.println("Exception" + e);
        }
    }
}
