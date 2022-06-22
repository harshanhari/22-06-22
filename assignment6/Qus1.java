package assignment6;

import java.util.Scanner;

public class Qus1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner nu = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = sc.nextLine();
		System.out.println("Enter the index : ");
		int i = nu.nextInt();
		char c = s1.charAt(i);
		System.out.println("The character at the index position of " + i + " is " + c);
	}

}
