package Com.DeepanshuSir.String;

import java.util.Scanner;

public class ReverseEachWordOfSentance {

	public static void main(String[] args) {
		
		//taking input from user
		Scanner KB= new Scanner(System.in);
		String str=KB.nextLine();
		

		//counting words
		int space=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				space++;
			}
		}


		//creating new String array
		String[] str2=new String[space+1];


		//copy each word into string array
		int j=str.length()-1;
		String temp="";
		for(int i=0; i<str2.length; i++) {
			while(j>=0 && str.charAt(j)!=' ') {
				temp+=str.charAt(j);
				j--;
			}
			str2[i]=temp;
			temp="";
			j--;
		}

		//displaying
		for(int i=str2.length-1; i>=0; i--)
			System.out.print(str2[i]+" ");
		
	KB.close();
	}
}