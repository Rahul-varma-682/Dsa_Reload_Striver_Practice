what ever the given array is we have to tell whether its sorted or not 
  if sorted = true, not sorted = return false


   import java.util.*;

public class SortedCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Take elements
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Check sorted
        boolean isSorted = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        // Step 4: Output
        if (isSorted) {
            System.out.println("Array is sorted (true)");
        } else {
            System.out.println("Array is NOT sorted (false)");
        }
    }
}
