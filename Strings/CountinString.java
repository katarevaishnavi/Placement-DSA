/* 
set all values to 0
use if else if statements 
for loop take ch 
character.isLetter(ch) Character.isdigit(ch) ==' ' use
increase count;
*/

import java.util.*;
import java.util.Scanner;

public class CountinString{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter String: ");
 String s = sc.nextLine();

 int alphabet = 0;
 int digit = 0;
 int spaces = 0;
 int splchar = 0;

 for(int i=0; i<s.length() ; i++){
 char ch = s.charAt(i);
 
 if (Character.isLetter(ch)) {
  alphabet++; }
 else if (Character.isDigit(ch)) {
  digit++;  }
 else if (ch == ' '){
  spaces++;  }
 else {
  splchar++;
  }
 }
 System.out.println("alphabhets in string : " +alphabet);
 System.out.println("Digits in string : " +digit);
 System.out.println("spaces in string : " +spaces);
 System.out.println("Special characters in string : " +splchar);
}
}

