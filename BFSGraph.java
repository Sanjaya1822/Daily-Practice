import java.util.Scanner;

class Queue {
    int size;
    int arr[];
    int front,rear;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    void enqueue(int data){
        if(front==-1 && rear==-1){
            front++;rear++;
            arr[rear]=data;
        }else if(rear==size-1) return;
        else{
            rear++;
            arr[rear]=data;
        }
    }
    boolean isEmpty(){
        return front==-1 || front>rear;
    }

    int dequeue(){
        if(front==-1 || front>rear) return -1;
        int a = arr[front];
        if(front==rear){
            front=-1;
            rear=-1;
        } else {
            front++;
        }
        return a;
    }
}
class bfs {
    Queue q;
    boolean[] visited;
    int[][] adj;
    int v;

    bfs(int v){
        this.v=v;
        q=new Queue(100);
        visited=new boolean[v];
        adj=new int[v][v];
    }

    void addedges(int s,int e){
        adj[s][e]=1;
        adj[e][s]=1;
    }

    void printer(int start){
        q.enqueue(start);
        visited[start]=true;

        while(!q.isEmpty()){
            int x=q.dequeue();
            System.out.print(x+" ");

            for(int i=0;i<v;i++){
                if(adj[x][i]==1 && !visited[i]){
                    visited[i]=true;
                    q.enqueue(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int v=sc.nextInt();
        bfs b=new bfs(v);
        int e=sc.nextInt();
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            b.addedges(s,d);
        }
        int start=sc.nextInt();
        b.printer(start);
    }
}
/*import java.util.*;

public class BFSGraph {

    static void bfs(ArrayList<ArrayList<Integer>> adj, int V, int start) {

        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()) {

            int node = q.poll();
            System.out.print(node + " ");

            for(int neighbor : adj.get(node)) {

                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }

            }
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(4);

        bfs(adj, V, 0);
    }
}                          ----------->>> Time complexity ------ O(V+E)
 */