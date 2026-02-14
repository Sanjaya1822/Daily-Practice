import java.util.Scanner;

class enode{
    int data;
    enode next;
    enode(int data){
        this.data=data;
        this.next=null;
    }
}
public class PostfixEvaluation {
    enode top=null;
    public void push(int data){
        enode newnode=new enode(data);
        if(top==null) {
            top=newnode;
        }else{
            newnode.next=top;
            top=newnode;
        }
    }
    public int pop(){
        int temp=top.data;
        top=top.next;
        return temp;
    }
    public int evaluation(String exp){
        int res=0;
        String[] ex=exp.split(" ");
        for(String ch:ex){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*")
               || ch.equals("/") || ch.equals("^")) {
                int b=pop();
                int a=pop();
                if(ch.equals("+")) res=a+b;
                else if(ch.equals("-")) res=a-b;
                else if(ch.equals("*")) res=a*b;
                else if(ch.equals("/")) res=a/b;
                else if(ch.equals("^")) res=(int)Math.pow(a,b);
                push(res);
            }
            else{
                push(Integer.parseInt(ch));
            }
        }
        return pop();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PostfixEvaluation ip=new PostfixEvaluation();
        String str=sc.nextLine();
        int res=ip.evaluation(str);
        System.out.println(res);
    }
}
