/*
create empty string
for loop--> take ch
check if it contains in result if no then add
IMP - RESULT.CONTAINS("" + CH) --> CONVERT CHAR TO STRING!!!!
*/

import java.util.*;
import java.util.Scanner;

public class RemoveDuplicate{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter String: ");
 String s = sc.nextLine();

 String result ="";

 for(int i=0; i<s.length();i++){
  char ch = s.charAt(i);
 
  if (!result.contains("" + ch)){
   result = result + ch;
  }
 }
 
 System.out.println("string removed duplicate is :" +result);
}
}