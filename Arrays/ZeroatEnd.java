import java.util.*;
public class ZeroatEnd {
 static void zeroatend(int[] ar){
  int nz=0;
  for(int z=0;z<ar.length;z++){
   if(ar[z] != 0){
    int t = ar[z];
    ar[z] = ar[nz];
    ar[nz] = t;
    nz++;
   }
  }
}
public static void main(String[] args){
 int[] ar = {3,5,0,8,2,6,0,0,3};
 zeroatend(ar);
 for(int i = 0; i<ar.length; i++){
  System.out.print(ar[i] +" " );
 }
}
}
   
    