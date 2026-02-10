import java.util.Scanner;

class knode{
    int data;
    knode next;
    knode(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseKLL {
    knode temp;
    knode head;
    void creation(int data){
        knode newnode=new knode(data);
        if(head==null){
            head=newnode;
            temp=newnode;
        }else{
            temp.next=newnode;
            temp=newnode;
        }
    }
    void display(knode head){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    static knode reverse(knode h1,int k){
        if (h1 == null) return null;
        knode temp = h1;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        if (count < k) return h1;
        knode curr = h1, prev = null, next = null;
        count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        h1.next = reverse(curr, k);
        return prev;
}
        public static void main(String[] args) {
       ReverseKLL pl=new ReverseKLL();
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            int data=sc.nextInt();
            pl.creation(data);
        }
        int k=sc.nextInt();
        knode reverseHead = reverse(pl.head,k);
        pl.display(reverseHead);

    }
}
