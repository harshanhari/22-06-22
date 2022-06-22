package assignment6;

import java.util.Scanner;

public class Qus11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner no = new Scanner(System.in);
		System.out.print("Enter the string to operate : ");
		String s1 = sc.nextLine();
		System.out.print("Enter the number to be divided : ");
		int n = no.nextInt();
		int len = s1.length();
		int dl = len / n;
		if (len % n != 0) {
			System.out.println("can't divide");
		} else {
			for (int i = 0; i < len; i++) {
				if (i % dl == 0)
					System.out.println();
				System.out.print(s1.charAt(i));
			}
		}
	}

}
