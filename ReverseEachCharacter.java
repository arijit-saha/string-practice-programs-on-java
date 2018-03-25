package Com.DeepanshuSir.String;

import java.util.Scanner;

public class ReverseEachCharacter {

	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=KB.nextLine();
		String str2="";
		
		//reversing
		for(int i=str.length()-1; i>=0; i-=2)
			str2+=str.charAt(i);
		
		System.out.print("After reverse : "+str2);
		KB.close();
	}
}

/* Enter the String : hello i am arijit
 * After reverse : tijira ma i olleh
*/