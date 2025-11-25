import java.util.*;
import java.util.Scanner;
public class CountVowelsConsonents {
public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the string : ");
 String s = sc.nextLine();
 s = s.toUpperCase();
 
 int vov_count = 0;
 int cos_count = 0;

 for (int i =0; i<=s.length()-1; i++){
  char c = s.charAt(i);
  if(c != ' '){
   if ( c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
   vov_count++;
   }
   else {
   cos_count++;
   }
  }
 }

 System.out.println("Vowel Count is : " +vov_count);
 System.out.println("Consonent Count is : " +cos_count); 
}
}
  