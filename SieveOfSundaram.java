import java.util.*;

public class SundaramSieve {
    public static void main(String[] args) {
        int n = 50; 
        int newN = (n - 1) / 2;
        boolean[] marked = new boolean[newN + 1];
        for (int i = 1; i <= newN; i++) {
            for (int j = i; (i + j + 2 * i * j) <= newN; j++) {
                marked[i + j + 2 * i * j] = true;
            }
        }

       
        if (n > 2) {
            System.out.print(2 + " ");
        }

        for (int i = 1; i <= newN; i++) {
            if (!marked[i]) {
                System.out.print((2 * i + 1) + " ");
            }
        }
    }
}
