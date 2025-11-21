import java.util.*;
public class SortedArray {
 static boolean issorted(int[]ar){
 for(int i =1;i<ar.length;i++){
  if(ar[i] < ar[i-1]){
  return (false);
  }
  }
 return (true);
 }
public static void main(String[] args){
int[] ar = {2,3,4,5,6,7,8};
boolean result = issorted(ar);
System.out.print("the give array is sorted: "+result);
}
}