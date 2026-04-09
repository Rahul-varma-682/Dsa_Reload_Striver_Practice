pattern:
5
    x
   xx
  xxx
 xxxx
xxxxx

java code :
import java.util.*;
public class Right_D_shaded {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){

                if(i+j>=n-1){
                    System.out.print("x");

                }
                 else{
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }
    }
    
}
