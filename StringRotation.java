package Com.DeepanshuSir.String;

import java.util.Scanner;

public class StringRotation
{
	public static void main(String[] args)
    	{
        	Scanner KB=new Scanner(System.in);
		System.out.print("Enter 1st string : ");
		String str1=KB.nextLine();
		System.out.print("Enter 2nd string : ");
		String str2=KB.nextLine();

	        //checking length
	        if(str1.length()!=str2.length()) {
			System.out.println("'"+str1+"' is not a rotated version of '"+str2+"'");
        	}
        	else {
			//adding both strings in one to check
			String str3=str1+str2;
 
			//checking given string is present or not
			for(int i=0; i<str1.length(); i++) {
				if(str1.charAt(i)==str3.charAt(i)) {
					break;
				}
				else {
					System.out.println("'"+str1+"' is not a rotated version of '"+str2+"'");
				}
			}
			System.out.println("'"+str1+"' is a rotated version of '"+str2+"'");
		}
	KB.close();
    }
}
