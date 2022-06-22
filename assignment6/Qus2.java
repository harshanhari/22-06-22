package assignment6;

import java.util.Scanner;

public class Qus2 {

	public static void main(String[] args) {
Scanner st=new Scanner(System.in);
Scanner nu=new Scanner(System.in);
System.out.print("Enter the String : ");
String s1=st.nextLine();
System.out.print("Enter the index value : ");
int n1=nu.nextInt();
int c=s1.codePointAt(n1);
System.out.println("Code point is "+c);
	}

}
