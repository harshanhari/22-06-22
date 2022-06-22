package assignment6;

import java.util.Scanner;

public class Qus9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
Scanner nu= new Scanner(System.in);
System.out.print("Enter the string : ");
String s1=sc.nextLine();
System.out.print("Enter the character from the given string to replace : ");
String s2=sc.nextLine();
System.out.print("Enter the new value to replace in the string");
String s3=sc.next();
System.out.println("Replacing...");
String s4=s1.replace(s2,s3);
System.out.println(s4);
	}

}
