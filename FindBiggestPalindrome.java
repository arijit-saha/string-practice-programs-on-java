package Com.DeepanshuSir.String;

import java.util.Scanner;

public class FindBiggestPalindrome {

	class Palin {
		Scanner KB = new Scanner(System.in);
		String str;
		void getdata() {
			System.out.print("Enter the string : ");
			str = KB.nextLine();
		}
		
		void display() {
			if(isPalindrome())
				System.out.println(str+" is a palindrome");
			else
				System.out.println(str+" is not a palindrome");
		}
		
		public boolean isPalindrome() {
			str = str.toLowerCase();
			int len = str.length()-1;
			for(int i=0; i<len/2; i++)
				if(str.charAt(i) != str.charAt(len-i))
					return false;
			return true;
		}
		
	public static void main(String[] args) {
		Palin p = new Palin();
		p.getdata();
		p.isPalindrome();
		p.display();
	}
}
