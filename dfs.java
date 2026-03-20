import java.util.*;
public class dfs {
    int v;
    int top;
    int[] stack;
    int[][] adj;
    boolean[] visited;
    dfs(int v){
        this.v=v;
        top=-1;
        stack=new int[100];
        visited=new boolean[v];
        adj=new int[v][v];
    }
    void addedges(int s,int e){
        adj[s][e]=1;
        adj[e][s]=1;
    }
    void push(int data){
        if(top==99) return;
        stack[++top]=data;
    }
    int pop(){
        if(top==-1) return -1;
        return stack[top--];
    }
    void printer(int start){
        push(start);
        while(top!=-1){
            int x=pop();
            if(!visited[x]){
                visited[x]=true;
                System.out.print(x+" ");
            }
            for(int i=v-1;i>=0;i--){
                if(adj[x][i]==1 && !visited[i]){
                    push(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int v=sc.nextInt();
        dfs f=new dfs(v);
        int e=sc.nextInt();
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            f.addedges(s,d);
        }
        int start=sc.nextInt();
        f.printer(start);
    }
}
/*import java.util.*;

public class DFSIterative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges (source destination):");

        for(int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);   // starting vertex

        System.out.println("DFS Traversal:");

        while(!stack.isEmpty()) {

            int node = stack.pop();

            if(!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");
            }

            for(int neighbor : adj.get(node)) {
                if(!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }
}  */