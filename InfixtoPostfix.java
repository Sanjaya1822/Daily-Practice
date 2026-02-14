import java.util.Scanner;

class inode{
    char data;
    inode next;
    inode(char data){
        this.data=data;
        this.next=null;
    }
}
public class InfixtoPostfix {
    inode top=null;
    public void push(char data){
        inode newnode=new inode(data);
        if(top==null) {
            top=newnode;
        }else{
            newnode.next=top;
            top=newnode;
        }
    }
    public char pop(){
        char temp=top.data;
        top=top.next;
        return temp;
    }
    public int precedence(char ch){
        if(ch=='(') return 0;
        else if (ch=='+'||ch=='-')return 1;
        else if(ch=='*'||ch=='/') return 2;
        else if(ch=='^') return 3;
        else return -1;
    }
    public String conversion(String exp){
        String res="";
        for(char ch:exp.toCharArray()){
            if(ch=='('){
                push(ch);
            }
            else if(ch==')'){
                while(top.data!='('){
                    res+=pop();
                }
                top=top.next;
            }
            else if(Character.isAlphabetic(ch)|| Character.isDigit(ch)){
                res+=ch;
            }
            else {
                while(top!=null && precedence(ch)<=precedence(top.data)){
                    res+=pop();
                }
                push(ch);
            }
        }
        while(top!=null) res+=pop();
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InfixtoPostfix ip=new InfixtoPostfix();
        String str=sc.next();
        String res=ip.conversion(str);
        System.out.println(res);
        
    }
}
