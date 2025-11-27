/*
compressing string and returning the count 
start string from index 1
keep count 1
create empty string comp;
go on comparing i and (i-1) and if = then count++
else add in comp --> add ch(i-1) +count;
reset count to 1;
for last char - comp = comp+s1.charAt(s.length()-1)+count;
*/

import java.util.*;
import java.util.Scanner;

public class CompressString{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter String: ");
 String s = sc.nextLine();
 
 String comp ="";
 int count = 1;
 
 for(int i = 1; i <s.length();i++){

  if(s.charAt(i) == s.charAt(i-1)){
   count++;
   }
  else{
   comp = comp + s.charAt(i-1) + count;
   count = 1;
  }
 }
  comp = comp + s.charAt(s.length()-1) +count;

  System.out.print(comp);
}
}