import java.util.*;
public class ExtractEvenOdd{
 static void even(int[] ar) {
  System.out.print("Even numbers are:");
  for(int i=0;i<ar.length;i++){
   if(ar[i]%2==0){
    System.out.print(ar[i]+" ");
   }
  }
 }
 static void odd(int[] ar) {
 System.out.print("odd numbers are:");
  for(int i=0;i<ar.length;i++){
   if(ar[i]%2==1){
    System.out.print(ar[i]+" ");
   }
  }
 }
public static void main(String[] args){
 int[] ar ={1,2,3,4,5,6,7,8,9,10};
 even(ar);
 odd(ar);
 }
}

