import java.util.*;
import java.util.Scanner;
public class PalindromeString {
public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the String : ");
 String org_str = sc.nextLine();

 String rev_str="";
 for(int i = org_str.length()-1;i>=0;i--){
  rev_str = rev_str + org_str.charAt(i);
 }
  
 if (org_str.equals(rev_str)){
  System.out.println("The String is Palindrome.");
 }
 else {
  System.out.println("The String is not a Palindrome."); 
 }
}
}
  