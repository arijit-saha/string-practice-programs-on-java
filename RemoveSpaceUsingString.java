package Com.DeepanshuSir.String;

import java.util.Scanner;

public class RemoveSpaceUsingString {

	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=KB.nextLine();
		String str2="";

		//remove space
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				str2+=str.charAt(i);
			}
		}
		
		//displaying
		System.out.print("After removing : "+str2);
		KB.close();
	}
}

/*
 * Enter the String : My    name    is Arijit
 * After removing : MynameisArijit
 */