import java.util.*;
import java.util.Scanner;

public class FirstNonRepeatingCh{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter String: ");
 String s = sc.nextLine();
 
 for (int i=0;i<s.length();i++){
  char ch = s.charAt(i);
  if(s.indexOf(ch) == s.lastIndexOf(ch)){
   System.out.println(ch);
   return;
  }
 }
}
}
