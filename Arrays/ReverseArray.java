import java.util.*;
public class ReverseArray{
 static void reverse(int[] ar){
  int i=0;
  int j=ar.length-1;
  while(i<=j){
   int t = ar[i];
   ar[i] = ar[j];
   ar[j] = t;
   i++;
   j--;
  }
 }

public static void main (String[] args){
 int ar[] = {1,2,3,4,5,6,7,8,9,10};
 reverse(ar);
 for(int i=0; i<=ar.length-1; i++){
 System.out.print(ar[i]+" ");
 }
}
}

/* few mistakes made in code to remember are-
 1.inside class there is main fun.
 2.inside class you are creating a object called Reverse hence passing parameters is very important.
 3.algo : create object Reverse(int[] ar)
           first element - i(0) and last element - j(ar.length-1)
          while loop :
           swap 2 variables using a temporary variable.
           I++ and J--;
          main function -
           define array
           call the reverse(ar) obj
           for loop and sop
*/  
 
          
