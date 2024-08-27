import java.util.*;
public class greaterequal {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        if(a==b)
        System.out.println("numbers are equal");
        else 
           {
            if(a>b)
            System.out.println("a is gretaer than b");
            else
            System.out.println("b is greater than a");
           }
    }
}
