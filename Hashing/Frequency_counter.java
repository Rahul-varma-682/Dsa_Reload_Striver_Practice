public class FrequencyCounter{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int n= sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Entetr array elements");

    for (int i =0;i<n;i++){
      arr[i]=sc.nextInt();
      
    }

    //hashing array
    int [] freq =new int[100];
    
    //precompute frequencies
    for (int value : arr){
      freq [value]++;
    }

    System.out.print("enter number of Queries");
    int q = sc.nextInt();

      while (q-- > 0) {

            System.out.print("Enter number to find frequency: ");

            int target = sc.nextInt();

            System.out.println(
                target + " occurred " + freq[target] + " times"
            );
        }

        sc.close();
    
  }
}
