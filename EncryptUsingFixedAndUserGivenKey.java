package Com.DeepanshuSir.String;

import java.util.Scanner;

public class EncryptUsingFixedAndUserGivenKey {
	
	//replace special char with space
	 static String removeSpecialChar(String arg) {
		String temp="";
		for(int i=0; i<arg.length(); i++) {
			if((arg.charAt(i)>=65 && arg.charAt(i)<=90) 
					|| (arg.charAt(i)>=97 && arg.charAt(i)<=122) 
					      || (arg.charAt(i)>=48 && arg.charAt(i)<=57)) {
				temp+=arg.charAt(i);
			}
			else {
				temp+=' ';
			}
		}
		return temp;
	}
	 
	 
	//remove leading and trailing space
	private static String removeBeginEnd(String arg) {
		String temp="";
		int start=0, end=0;
		for(int i=0; i<arg.length(); i++) {
			if(arg.charAt(i)==' ') {
				start++;
			}
			else {
				break;
			}
		}

		for(int i=arg.length()-1; i>=0; i--) {
			if(arg.charAt(i)==' ') {
				end++;
			}
			else {
				break;
			}
		}
		
		end=arg.length()-1-end;
		for(int i=start; i<=end; i++) {
			temp+=arg.charAt(i);
		}
	return temp;
	}
	
	
	//encrypt1
	private static String encrypt1(String arg) {
		String arg2="";
		arg2=removeSpecialChar(arg);
		arg2=removeBeginEnd(arg2);
	return arg2;
	}
	
	
	//encrypt2
	private static String encrypt2(String arg, int key) {
		String temp="";
		for(int i=0; i<arg.length(); i++) {
			if((arg.charAt(i)>=65 && arg.charAt(i)<=90-key) 
					|| (arg.charAt(i)>=97 && arg.charAt(i)<=122-key)
						|| (arg.charAt(i)>=48 && arg.charAt(i)<=57)) {
				temp+=(char)(arg.charAt(i)+key);
			}
			else {
				temp+=(char)(arg.charAt(i)-26+key);
			}
		}
		return temp;
	}
	
	
	//main
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=KB.nextLine();
		System.out.print("Enter encryption key : ");
		int key2=KB.nextInt();
		
		//encrypting using key1=space(fixed)
		str=encrypt1(str);
		
		//encrypting using key1=user definer
		str=encrypt2(str,key2)+" ";
		
		System.out.print("Encrypted string is : "+str);
		
	KB.close();	
	}
}