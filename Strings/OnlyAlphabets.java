import java.util.*;
import java.util.Scanner;

public class OnlyAlphabets{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter String: ");
 String s = sc.nextLine();

 String alpha = "";
 
 for(int i=0;i<s.length();i++){
  char ch = s.charAt(i);
  
  if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
   alpha = alpha + ch;
  }
 }
 System.out.println("Only alphabets :" +alpha);
}
}
