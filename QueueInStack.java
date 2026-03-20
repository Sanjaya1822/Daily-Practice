import java.util.*;
public class QueueInStack {
    int size;
    int[] s1;
    int[] s2;
    int top1,top2;
    QueueInStack(int size){
        this.size=size;
        s1=new int[size];
        s2=new int[size];
        top1=-1;
        top2=-1;
    }
    void enqueue(int data){
        if(top1==size-1){
            System.out.println("Overflow");
        }else{
            while(top1!=-1){
                int a=s1[top1--];
                s2[++top2]=a;
            }
            s1[++top1]=data;
            while(top2!=-1){
                int a=s2[top2--];
                s1[++top1]=a;
            }
        }
    }
    void dequeue(){
        if(top1==-1) System.out.println("Underflow");
        else{
            int a=s1[top1--];
        }
    }
    void display(){
        int temp=top1;
        while(temp!=-1){
            System.out.print(s1[temp]+" ");
            temp--;
        }
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        QueueInStack qa= new QueueInStack(n);
        for(int i=0;i<n;i++){
            qa.enqueue(sc.nextInt());
        }
        qa.display();
        qa.dequeue();
        qa.display();
    }
}
