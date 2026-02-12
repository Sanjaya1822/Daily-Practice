import java.util.*;
class onode{
    int data;
    onode next;
    onode(int data){
        this.data=data;
        this.next=null;
    }
}
public class LLoddeven {
    onode temp;
    onode head;
    void creation(int data){
        onode newnode=new onode(data);
        if(head==null){
            head=newnode;
            temp=newnode;
        }else{
            temp.next=newnode;
            temp=newnode;
        }
    }
    void display(onode head){
        onode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static onode oddeve(onode h1) {
        if (h1 == null) return null;

        onode evenHead = null, evenTail = null;
        onode oddHead = null, oddTail = null;

        onode curr = h1;

        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = curr;
                    evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = curr;
                    oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
            curr = curr.next;
        }

        // connect even list with odd list
        if (evenTail != null)
            evenTail.next = oddHead;

        // last node must point to null
        if (oddTail != null)
            oddTail.next = null;

        return (evenHead != null) ? evenHead : oddHead;
}
    public static void main(String[] args) {
        LLoddeven el=new LLoddeven();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            el.creation(data);
        }
        onode res=oddeve(el.head);
        el.display(res);
    }
}
