package Com.DeepanshuSir.String;

import java.util.Scanner;

public class Anagram2 {
	
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
			else {
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
		System.out.print("Enter the number of string(s) : ");
		
		//int size=KB.nextInt();
		//if nextInt() is used then nextLine() cannot be used
		
		int size=Integer.parseInt(KB.nextLine());
		String[] str=new String[size];
		
		System.out.println("Enter the string(s) : ");
		for(int i=0; i<str.length; i++) {
			str[i]=KB.nextLine();
		}
		
		//coping the string array to another array
		String[] str2=new String[size];
		for(int i=0; i<str.length; i++) {
			str2[i]=str[i];
		}
		
		//creating object and calling the methods
		Anagram2 obj=new Anagram2();
		
		for(int i=0; i<str.length; i++) {
			str[i]=obj.removeSpace(str[i]);	
		}

		for(int i=0; i<str.length-1; i++) {
			for(int j=i+1; j<str.length; j++) {
				if(str[i].length()==str[j].length()) {
					str[i]=obj.toLowerCase(str[i]);
					str[j]=obj.toLowerCase(str[j]);
	
					str[i]=obj.sort(str[i]);
					str[j]=obj.sort(str[j]);
				
					boolean bol=obj.compare(str[i], str[j]);

					if(bol) {
						System.out.println("'"+str2[i]+"' and '"+str2[j]+"' are anagram");
					}	
				}
				else {
					System.out.println("'"+str2[i]+"' and '"+str2[j]+"' are not anagram");
				}
			}
		}
	KB.close();
	}
}
		