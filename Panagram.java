package Com.DeepanshuSir.String;

import java.util.Scanner;

public class Panagram {

	//remove space
	private static String removeSpace(String arg) {
		String temp="";
		for(int i=0; i<arg.length(); i++) {
			if(arg.charAt(i)!=' ') {
				temp+=arg.charAt(i);
			}
		}
	return temp;
	}

	//convert to lower 
	private static String toLowerCase(String arg) {
		char[] arr=arg.toCharArray();
		String temp="";
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=65 && arr[i]<=90) {
				temp+=(char)(arr[i]+32);
			}
			else if(arr[i]>=97 && arr[i]<=122) {
				temp+=arr[i];
			}
			else {
				temp+=arr[i];
			}
		}
	return temp; 
	}

	//sorting
	private static String sort(String arg) {
		char[] arr=arg.toCharArray();
		String temp="";
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					char t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			temp+=arr[i];
		}
	return temp;
	}
	
	//remove duplicate
	private static String removeDuplicate(String arg) {
		char[] arr=arg.toCharArray();
		String temp="";
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp+=arr[i];
			}
		}
		temp+=arr[arr.length-1];
	return temp; 
	}

	//string compare
	private static boolean compare(String arg0, String arg1) {
		for(int i=0; i<arg0.length(); i++) {
			if(arg0.charAt(i)!=arg1.charAt(i)) {
				return false;
			}
		}
	return true;
	}


	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=KB.nextLine();
		String str1="abcdefghijklmnopqrstuvwxyz";

		//coping into a new string to display output
		String str2=str;

		str=removeSpace(str);
		str=toLowerCase(str);
		str=sort(str);
		str=removeDuplicate(str);
		
		boolean bol=compare(str, str1);
			
			if(bol) {
				System.out.println(str2+" is a panagram");
			}
			else {
				System.out.println(str2+" is not a panagram");
			}
	KB.close();
	}
}