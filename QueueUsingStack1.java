import java.util.Scanner;

class QueueUsingStack1 {

    int[] stack;
    int top = -1;
    int size;

    QueueUsingStack1(int size) {
        this.size = size;
        stack = new int[size];
    }


    void enqueue(int data) {
        if (top == size - 1) {
            System.out.println("Overflow");
            return;
        }
        insertAtBottom(data);
    }

    void insertAtBottom(int data) {
        if (top == -1) {
            stack[++top] = data;
            return;
        }

        int temp = stack[top--];
        insertAtBottom(data);
        stack[++top] = temp;
    }


    int dequeue() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return stack[top--];
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        QueueUsingStack1 q = new QueueUsingStack1(n);

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            q.enqueue(data);
        }

        q.display();
        System.out.println("After Dequeue: " + q.dequeue());
        q.display();
    }
}