import java.util.*;
class mnode{
    int data;
    mnode next;
    mnode(int data){
        this.data=data;
        this.next=null;
    }
}
public class MergeLL {
    mnode temp;
    mnode head;
    void creation(int data){
        mnode newnode=new mnode(data);
        if(head==null){
            head=newnode;
            temp=newnode;
        }else{
            temp.next=newnode;
            temp=newnode;
        }
    }
    void display(mnode head){
        mnode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static mnode merge(mnode h1, mnode  h2) {
        if (h1 == null) return h2;
        if (h2 == null) return h1;
        mnode head;
        if (h1.data <= h2.data) {
            head = h1;
            h1 = h1.next;
        } else {
            head = h2;
            h2 = h2.next;
        }
        mnode temp = head;
        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }
        if (h1 != null)
            temp.next = h1;
        else
            temp.next = h2;
        return head;
    } 
     public static void main(String[] args) {
        MergeLL ml1=new MergeLL();
        MergeLL ml2=new MergeLL();
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            int data=sc.nextInt();
            ml1.creation(data);
        }
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            int data=sc.nextInt();
            ml2.creation(data);
        }
        mnode mergedHead = merge(ml1.head, ml2.head);
        ml1.display(mergedHead);
    }
}
