import java.util.*;
public class ArrayLeaders{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=  new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> li=new ArrayList<>();
        int maxR=arr[n-1];
        li.add(maxR);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxR){
                li.add(arr[i]);
                maxR=arr[i];
            }
        }
        Collections.reverse(li);
        System.out.println(li);

    }
}