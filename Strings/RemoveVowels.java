import java.util.*;
import java.util.Scanner;
public class RemoveVowels {
public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string : ");
 String s = sc.nextLine();

 s= s.replaceAll("(?i)[aeiou]" ,"");
 System.out.println("Removed Vowels from string :" +s);
 }
}
