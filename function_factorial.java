import java.util.*;
public class function_factorial {
    public static int factorial(int n){
        int fact=1;
        while(n>0)
        {
            fact=fact*n--;
        }
        return fact;
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        System.out.println(factorial(x));
    }
}
