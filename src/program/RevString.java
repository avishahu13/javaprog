package program;

import java.util.Scanner;
		
public class RevString {
	
	
	public static String rev(String a) {
		String rev="";
		char c[] = a.toCharArray();
		
		for(int i = c.length-1;i>=0;i--) {
			
			rev=rev+c[i];
		}
		
		return rev;
	}

	public static void main(String[] args) {
		String a;
	Scanner sc = new Scanner (System.in);
	System.out.println("Entre the string to reverse");
	a = sc.nextLine();
			String b= rev(a);
			
			System.out.println("reverse of string = " +b);
	}
	
}
