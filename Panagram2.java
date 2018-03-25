package Com.DeepanshuSir.String;

import java.util.Scanner;

public class Panagram2 {

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
		System.out.println("Enter the number of string(s) : ");
		int size=Integer.parseInt(KB.nextLine());
		
		//creating new String array
		String[] str=new String[size];
		
		System.out.println("Enter the string(s) : ");
		for(int i=0; i<str.length; i++) {
			str[i]=KB.nextLine();
		}
		
		String str1="abcdefghijklmnopqrstuvwxyz";
		
		//coping the original string
		String[] str2=new String[size];
		for(int i=0; i<str2.length; i++) {
			str2[i]=str[i];
		}
		//performing and displaying from String array
		for(int i=0; i<str.length; i++) {
			str[i]=removeSpace(str[i]);
			str[i]=toLowerCase(str[i]);
			str[i]=sort(str[i]);
			str[i]=removeDuplicate(str[i]);
			
			boolean bol=compare(str[i], str1);
			
				if(bol) {
					System.out.println(str2[i]+" is a panagram");
				}
				else {
					System.out.println(str2[i]+" is not a panagram");
				}
		}
	KB.close();
	}
}