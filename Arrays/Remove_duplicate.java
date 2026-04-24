we have to remove the duplicates in the given array alomg with that we have to tell  the count of real values

  import java.util.*;
public class Remove_duplicate{
  public static void main (String[] args){

    Scanner sc = new Scanner (System.in);

    System.out.println("Enter the size of tha Array");
    int n=sc.nextInt();

    int [] a = new int [];

   System.out.println("Enter " + n + " sorted numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Edge case
        if (n == 0) {
            System.out.println("Empty array");
            return;
        }

        int k = 1; // pointer for unique elements

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        // Print unique elements
        System.out.println("Unique elements:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
      
    }
  }
}
  
