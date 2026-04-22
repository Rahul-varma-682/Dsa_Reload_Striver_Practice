well in this we have to find the second largest number in a array but [print the first largest and secondlargest at a time ]
input = [4,5,6,7,9] , output =[9,6]


import java.util.*;

public class Second_largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int secondLargest = -1; // or Integer.MIN_VALUE

        for (int i = 1; i < n; i++) {

            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            }

            else if (a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
