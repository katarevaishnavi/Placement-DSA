/* 2 strings 0- longest , word
  if ch a-z && != ' ' 
  word = word + ch;
  else --> when word complete
  if (word.length()>Longest.length()) --> longest = word
*/

import java.util.*;
import java.util.Scanner;

public class Longestword{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter String: ");
 String s = sc.nextLine();

 String word = "";
 String longest = "";
 
 for(int i =0; i<s.length();i++){

 if ((i < s.length()) && (s.charAt(i) != ' ')){
  word = word + s.charAt(i);
 }
 else {
  if (word.length() > longest.length()){
   longest=word;
  }
 word="";
 }
 if (word.length() > longest.length()){
   longest=word; }
 }
 System.out.println("Longest word is :" +longest);
}
}

