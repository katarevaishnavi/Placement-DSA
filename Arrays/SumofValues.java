import java.util.*;
public class SumofValues{
 static int arraysum(int[] ar){
  int sum=0;
  for(int i=0;i<ar.length;i++)
  {
   sum=sum+ar[i];
  }
  return(sum);
 }
public static void main(String[] args){
 int ar[] = {10,20,30,40,50,60,70,80,90};
 int totalsum=arraysum(ar);
 System.out.println("sum of elements in array is: "+totalsum);
}
}
  