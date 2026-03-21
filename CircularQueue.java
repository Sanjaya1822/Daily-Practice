import java.util.Scanner;
class cqnode{
    int data;
    cqnode next=null;
    cqnode (int data){
        this.data=data;
        this.next=null;
    }
}
public class CircularQueue {
    cqnode front,rear;
        void enqueue(int data){
            cqnode newnode=new cqnode(data);
            if(front==null && rear==null){
                front=newnode;
                rear=newnode;
            }else{
                rear.next=newnode;
                rear=newnode;
                rear.next=front;
            }
        }
        void dequeue(){
            if(front==null && rear==null) System.out.println("Underflow");
            else{
                front=front.next;
                rear.next=front;
            }
        }
        void peek(){
            if(front==null && rear==null) System.out.println("Underflow");
            else System.out.println(front.data);
        }
        void display(){
            cqnode temp=front;
            while(temp.next!=front){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print(temp.data);
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CircularQueue cq=new CircularQueue();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            cq.enqueue(sc.nextInt());
        }
        cq.display();
        System.out.println();
        cq.dequeue();
        cq.display();
        System.out.println();
        cq.peek();
    }
}
