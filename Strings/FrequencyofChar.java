import java.util.*;
import java.util.Scanner;
public class FrequencyofChar {
public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the string : ");
 String s = sc.nextLine();
 int arr[] = new int [256];
 
 for(int i=0;i<=s.length()-1;i++) {
  char c = s.charAt(i);
  int x = (int)c;
  arr[x]++;
 }

 for(int i =0;i<256;i++){
  if ( arr[i] != 0) {
   System.out.println((char)i + " : " +arr[i]);
  }
 }
}
}
 
  

