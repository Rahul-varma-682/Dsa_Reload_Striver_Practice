Given  the number 'n', find out  and return the number of digits present in a number.

  input : 134...... output:3

  java code :

import java.util.*;
public class Count_Digits{
  public static void main (String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count =0;

while (n>0){

  n=n/10;
  count++;
}
System.out.println(count);
}
}
