Reverse a number using the math

import java.util.*;

public class Reverse_A_Number {
     public static void main(String[]args){
Scanner sc = new Scanner(System.in);
 System.out.println("Enter number : ");
    int n = sc.nextInt();
    int reverse=0;
   while(n>0){
     int Last =n%10;

    reverse = (reverse*10)+Last;
    n=n/10;
   }
   
    System.out.print(reverse);
}
}
