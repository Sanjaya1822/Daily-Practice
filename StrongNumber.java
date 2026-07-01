import java.util.*;
public class StrongNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int sum=0;
        while(n>0){
            int a=n%10;
            int fact=1;
            for(int i=1;i<=a;i++){
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        if(sum==org) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}