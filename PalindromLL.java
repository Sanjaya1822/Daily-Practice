import java.util.Scanner;

class pnode{
    int data;
    pnode next;
    pnode(int data){
        this.data=data;
        this.next=null;
    }
}
public class PalindromLL {
    pnode temp;
    pnode head;
    void creation(int data){
        pnode newnode=new pnode(data);
        if(head==null){
            head=newnode;
            temp=newnode;
        }else{
            temp.next=newnode;
            temp=newnode;
        }
    }
    void display(pnode head){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static pnode reverse(pnode h1){
        pnode slow=h1,fast=h1;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        pnode curr=slow,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        slow=prev;
        return slow;
    }
    void palindrome(pnode h1,pnode h2){
        pnode temp1=h1;
        pnode temp2=h2;
        while(temp2!=null ){
            if(temp1.data!=temp2.data){
                System.out.println("Not Palindrome");
                return;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
       PalindromLL pl=new PalindromLL();
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            int data=sc.nextInt();
            pl.creation(data);
        }
        pnode reverseHead = reverse(pl.head);
        pl.palindrome(reverseHead, pl.head);

    }
}
