/* anagrams - 2 words having same letter. 
convert to lowercase
char --> array 
sort the array 
if sorted array is equal then anagram.
*/

import java.util.*;
import java.util.Scanner;

public class CheckAnagram{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter first word: ");
 String s1 = sc.nextLine();
 System.out.println("Enter second word: ");
 String s2 = sc.nextLine();
 
 s1=s1.toLowerCase();
 s2=s2.toLowerCase();
   
 char[] a = s1.toCharArray();
 char[] b = s2.toCharArray();
 
 Arrays.sort(a);
 Arrays.sort(b);
 
 if(Arrays.equals(a,b)){
  System.out.println("it is Anagram");
  }
 else{
  System.out.println("not an Anagram");
  }
}
}

 