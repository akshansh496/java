import java.util.*;
public class function_sum {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=sum(x,y);
        System.out.println(a);

    }
}
