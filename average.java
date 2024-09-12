import java.util.*;
public class average {
    public static double avg(int a,int b,int c){
        double average=(a+b+c)/3;
        return average;
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println(avg(x,y,z));
    }
}
