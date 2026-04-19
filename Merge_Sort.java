import java.util.Scanner;

public class mergesort {
    public static  void  merge(int[] arr,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int k=low;
        int t[]=new int[arr.length];
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                t[k]=arr[i];
                i++;
            }
            else{
                t[k]=arr[j];
                j++;
            }
            k++;
        }
        while(j<=high){
            t[k]=arr[j];
            j++;
            k++;
        }
        while(i<=mid){
            t[k]=arr[i];
            i++;
            k++;
        }
        for(int s=low;s<=high;s++) arr[s]=t[s];
    }
    public static void partition(int[] arr,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            partition(arr,low,mid);
            partition(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        partition(arr,0,n-1);
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
    
}
