in this code we can we rotate a array by k places

 import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter rotation k: ");
        int k = scanner.nextInt();

        k = k % n; // normalize

        // temporary storage
        int[] temp = new int[k];

        // copy first k elements
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // shift remaining elements
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // place stored elements at the end
        int index = n - k;
        for (int value : temp) {
            arr[index++] = value;
        }

        // print result
        System.out.println("Rotated Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
