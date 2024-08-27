import java.util.*;
public class calculator {
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter a number");
      int a=sc.nextInt();
      System.out.println("enter a number");
      int b=sc.nextInt();
      int sum=a+b;
      int diff=a-b;
      int prod=a*b;
      double div=a/b;
      double mod=a%b;
      System.out.println(sum);
      System.out.println(diff);
      System.out.println(prod);
      System.out.println(div);
      System.out.println(mod);
    }
    
}
