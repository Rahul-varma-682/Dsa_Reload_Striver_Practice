 Left rotate an array by k positions using the reverse technique.
// This approach avoids extra space by reversing parts of the array in-place.
// Time Complexity: O(n), Space Complexity: O(1)


import java.util.*;

public class LeftRotateOptimal {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void leftRotate(int[] arr, int n, int d) {
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        leftRotate(arr, n, d);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
