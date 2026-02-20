import java.util.Scanner;
public class stackrev {
     int size;
    int arr[];
    int top;
    stackrev(int size){
        this.size=size;
        arr =new int[size];
        top=-1;
    }
    void push(int data){
        if(top==size-1) System.out.println("Overflow");
        else{
            arr[++top]=data;
        }
    }
    
    void display(){
        if(top==-1) System.out.println("Underflow");
        else{
            for(int i=top;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
        }
    }
    void rev(){
        int left=top,right=0;
        while(left>right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left--;
            right++;
        }
    }
    void leftmin(){
        System.out.println(arr[0]+":"+"-1");
        for(int i=top;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    System.out.println(arr[i]+":"+arr[j]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        stackrev sa=new stackrev(n);
        for(int i=0;i<n;i++){
            sa.push(sc.nextInt());
        }
        sa.display();
        System.out.println();
        sa.leftmin();
       
    }
}
