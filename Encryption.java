package Com.DeepanshuSir.String;
//partially correct
import java.util.Scanner;

public class Encryption {
	
	//remove space and special char
	private static String removeSpaceAndSpecial(String arg) {
		String temp="";
		for(int i=0; i<arg.length(); i++) {
			if(arg.charAt(i)==' ' && arg.charAt(i+1)!=' ') {
				temp+=arg.charAt(i);
			}
			else if(arg.charAt(i)>=97 && arg.charAt(i)<=122) {
				temp+=arg.charAt(i);
			}
			else if(arg.charAt(i)>=65 && arg.charAt(i)<=90) {
				temp+=arg.charAt(i);
			}
	}
	return temp;
}
	
	private static String checkSpaceInString(String arg) {
		String temp="";
		for(int i=0; i<arg.length(); i++) {
			
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=KB.nextLine();
		
		str=removeSpaceAndSpecial(str);
		str=checkSpaceInString(str);
		
		System.out.print(str);
	KB.close();
	}
}
