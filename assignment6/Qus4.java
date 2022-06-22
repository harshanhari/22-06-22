package assignment6;

import java.util.Scanner;

public class Qus4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st string : ");
		String s1=sc.nextLine();
		System.out.print("Enter the 2nd string : ");
		String s2=sc.nextLine();
		System.out.println(s1.compareToIgnoreCase(s2));	
	}

}
