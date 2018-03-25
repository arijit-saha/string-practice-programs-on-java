package Com.DeepanshuSir.String;

import java.util.Scanner;

public class DecryptUsingKey {
	
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=KB.nextLine();
		System.out.print("Enter decryption key : ");
		int key=KB.nextInt();
		String temp="";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90-key 
					|| str.charAt(i)>=97 && str.charAt(i)<=122-key
						|| str.charAt(i)>=48 && str.charAt(i)<=57) {
					temp+=(char)(str.charAt(i)-key);
			}
			else {
				temp+=(char)(str.charAt(i)-key+26);
			}
		}
		System.out.print("Decrypted string is : "+temp);
	KB.close();	
	}
}
