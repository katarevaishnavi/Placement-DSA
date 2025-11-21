import java.util.*;
public class MissingNumber {

 static int sum1(int[]ar){
 int n= ar.length;
 int sum1 = 0;
 for(int i=0;i<n;i++){
  sum1=sum1+ar[i];
  }
 return(sum1);
 }

 static int sum2(int[] ar){
 int n=ar.length;
 int sum2 = 0;
 for(int i =1;i<=n+1;i++){
  sum2=sum2+i;
  }
 return(sum2);
 }

public static void main(String[] args){
int[] ar={1,2,3,5,6,7,8,9,10};
int s1 = sum1(ar);
int s2 = sum2(ar);

int Missing_num = s2-s1;
System.out.println("Missing number is : "+Missing_num);
}
}

