package Com.DeepanshuSir.String;

import java.util.Scanner;

public class RemoveSpaceUsingArray {

	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=KB.nextLine();
		String str2="";
		
		//string to array
		char[] arr=str.toCharArray();
		
		//remove space
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=' ') {
				str2+=arr[i];
			}
		}
		
		//displaying
		System.out.print("After removing : "+str2);
		KB.close();
	}
}