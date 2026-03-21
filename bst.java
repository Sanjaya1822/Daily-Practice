import java.util.*;
class bsnode{
    int data;
    bsnode left,right;
    bsnode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class bst {
    static bsnode root;
    static void insert(int data){
        bsnode newnode=new bsnode(data);
        if(root==null){
            root=newnode;
            return;
        }
        bsnode temp=root;
        bsnode curr=null;
        while(temp!=null){
            curr=temp;
            if(data<temp.data){
                temp=temp.left;
            }else temp=temp.right;
        }
        if(data<curr.data){
            curr.left=newnode;
        }else curr.right=newnode;
    }
    static void postorder(bsnode temp){
        if(temp!=null){
            postorder(temp.left);
            postorder(temp.right);
            System.out.print(temp.data+" ");
        }
    }
    static boolean search(bsnode root,int key){
        if(root==null){
            return false;
        }
        bsnode temp=root;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }else if(temp.data>key){
                temp=temp.left;
            }else{
                temp=temp.right;
            }
        }
        return false;
    }
    static int height(bsnode root) {
        if (root == null)
            return -1;
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        return Math.max(lHeight, rHeight) + 1;
    }

    static bsnode delete(bsnode root, int key){
        if(root==null) return root;
        if(key<root.data){
            root.left=delete(root.left, key);
        }
        else if(key>root.data){
            root.right=delete(root.right, key);
        }else{
        if(root.left ==null){
            return root.right;
        }
        if(root.right==null){
            return root.left;
        }else{
            root.data=min(root.right);
            root.right=delete(root.right, root.data);
        }
    }
        return root;
    }
    static int min(bsnode temp){
        int min=temp.data;
        while(temp!=null){
            min=temp.data;
            temp=temp.left;
        }
        return min;
    }
    static int secondlargest(bsnode root){
        bsnode temp=root;
        int max=temp.data;
        while(temp.right.right!=null){
            temp=temp.right;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        postorder(root);
        //int key=sc.nextInt();
       // bsnode r=delete(root,key);
        //postorder(r);
       // System.out.println(height(root));
        System.out.println(secondlargest(root));
    }
}
