import java.util.*;
public class MaxMinArray{
 public static void main(String[] args) {
  int[] ar={20,30,60,10,80};
  int max = ar[0];
  for(int i=1; i<ar.length; i++){
   if(ar[i]>max){
    max=ar[i];
    }
  }
  System.out.println("Maximum Number in array is: "+max);

  int min = ar[0];
  for(int i =1; i<ar.length;i++){
   if(ar[i]<min){
    min=ar[i];
   }
  }
  System.out.println("Minimum Number in array is: "+min);
}
}