import java.util.*;

class Main {
    public static void countingSort(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
