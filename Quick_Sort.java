import java.util.Scanner;
public class quicksort {
    public static int partition(int[] arr,int s,int e){
        int mid=(s+e)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot) s++;
            while(arr[e]>pivot) e--;
            if(s<=e){
                int temp=arr[e];
                arr[e]=arr[s];
                arr[s]=temp;
                s++;
                e--;
            }
        }
        return s;
    }
    public static void quick(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quick(arr,low,pi-1);
            quick(arr,pi+1,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quick(arr,0,n-1);
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }  
}
