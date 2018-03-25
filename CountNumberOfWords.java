package Com.DeepanshuSir.String;

import java.util.Scanner;
public class CountNumberOfWords {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=KB.nextLine();
		int count=1;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
				count++;
		}
		System.out.print("Total Words : "+count);
	KB.close();
	}
}