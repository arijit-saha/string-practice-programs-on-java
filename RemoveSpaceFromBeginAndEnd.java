package Com.DeepanshuSir.String;

import java.util.Scanner;

public class RemoveSpaceFromBeginAndEnd {

	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=KB.nextLine();
		
		int start=0, end=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				start++;
			}
			else {
				break;
			}
		}

		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==' ') {
				end++;
			}
			else {
				break;
			}
		}
		
		end=str.length()-1-end;
		String str2="";
		for(int i=start; i<=end; i++) {
			str2+=str.charAt(i);
		}
		System.out.print("Result is : "+str2);
		
	KB.close();
	}
}


/*
 * Enter the string :     i am arijit
 *  Result is : i am arijit
 */