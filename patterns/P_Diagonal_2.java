Pattern :

        x
      x 
    x  
  x   
x    

  java code : 

import java.util.Scanner;

public class P_Diagonal_2 {
     public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if ((i+j)==n-1){
                    System.out.print("x");
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }


