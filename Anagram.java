package Com.DeepanshuSir.String;

import java.util.Scanner;

public class Anagram {
	
	//remove space
	private String removeSpace(String arg) {
		String temp="";
		for(int i=0; i<arg.length(); i++) {
			if(arg.charAt(i)!=' ')
				temp+=arg.charAt(i);
		}
	return temp;
	}

	//to lower case
	private String toLowerCase(String arg) {
		String temp="";
		for(int i=0; i<arg.length(); i++) {
			if(arg.charAt(i)>=97 && arg.charAt(i)<=122) {
				temp+=arg.charAt(i);
			}
			else if(arg.charAt(i)>=65 && arg.charAt(i)<=90) {
				temp+=(char)(arg.charAt(i)+32);
			}
			else{
				temp+=arg.charAt(i);
			}
		}
	return temp;
	}

	//sorting
	private String sort(String arg) {
		char[] ch=arg.toCharArray();
		String str="";
		for(int i=0; i<ch.length-1; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(int i=0; i<ch.length; i++) {
			str+=ch[i];
		}
	return  str;
	}

	//compare strings
	private boolean compare(String s1, String s2) {
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
			else {
				return true;
			}
		}
	return true;
	}


	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
				
		System.out.println("Enter the first string : ");
		String str1=KB.nextLine();
		System.out.println("Enter the second string : ");
		String str2=KB.nextLine();
		
		//coping the strings into another string
		String str3=str1;
		String str4=str2;
		
		//creating object and calling the methods
		Anagram obj=new Anagram();
		
		str1=obj.removeSpace(str1);
		str2=obj.removeSpace(str2);

		if(str1.length()==str2.length()) {
			str1=obj.toLowerCase(str1);
			str2=obj.toLowerCase(str2);
			str1=obj.sort(str1);
			str2=obj.sort(str2);
			
			boolean bol=obj.compare(str1, str2);

			if(bol) {
				System.out.println("'"+str3+"' and '"+str4+"' are anagram");
			}			
		}
		else {
			System.out.println("'"+str3+"' and '"+str4+"' are not anagram");
		}
	KB.close();
	}
}
		