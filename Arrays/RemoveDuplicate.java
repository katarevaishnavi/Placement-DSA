import java.util.*;
public class RemoveDuplicate{
 static int duplicaterem(int[] ar){
 int rd = 0;
 for (int i=1; i<ar.length;i++){
  if(ar[rd] != ar[i]){
   rd++;
   ar[rd] = ar[i];
  }}
 return rd+1;
}
public static void main(String[] args){
 int[] ar = {1,1,2,2,3,4,5,6,7,7,7,8};
 int rd = duplicaterem(ar);
 for(int i=0;i<rd;i++){
  System.out.print(ar[i]+" ");
 }
}
}