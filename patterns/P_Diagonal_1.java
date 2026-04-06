pattern :

X    
 X   
  X  
   X 
    X

java code :

  import java.util.*;
public class P_Diagonal_1 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if (i==j){
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
