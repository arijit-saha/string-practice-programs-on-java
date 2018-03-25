package Com.DeepanshuSir.String;

import java.util.Scanner;

public class LowerToUpperViceVersa {

	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=KB.nextLine();
		String str2="";
		
		for(int i=0; i<str.length(); i++) {
			
			//to make lower to upper
			if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				str2+=(char)(str.charAt(i)-32);
			}

			//to make upper to lower
			else if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				str2+=(char)(str.charAt(i)+32);
			}
			else {
				str2+=str.charAt(i);
			}
		}
		
		System.out.print("After reverse : "+str2);
		KB.close();
	}
}