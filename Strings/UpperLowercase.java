import java.util.*;
import java.util.Scanner;
public class UpperLowercase {
public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the string : ");
 String s = sc.nextLine();
 
 String uppercase = s.toUpperCase();
 System.out.println("The String in Upper case is : " +uppercase);
 
 String lowercase = s.toLowerCase();
 System.out.println("The String in Lower case is : " +lowercase);
}
}
