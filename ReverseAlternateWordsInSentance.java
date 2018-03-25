package Com.DeepanshuSir.String;

import java.util.Scanner;

public class ReverseAlternateWordsInSentance {

	public static void main(String[] args) {
		
		//input from keyboard
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=KB.nextLine();
		
		//counting words in a string
		int space=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
				space++;
		}

		//creating new string array
		String[] str2=new String[space+1];
		
		//coping into string array
		int j=0;
		String temp="";
		for(int i=0; i<str2.length; i++) {
			while(j<str.length() && str.charAt(j)!=' ') {
				temp+=str.charAt(j);
				j++;
			}
			str2[i]=temp;
			temp="";
			j++;
		}
		
		//swapping the words
		for(int i=0; i<str2.length/2; i++) {
				String t=str2[i];
				str2[i]=str2[str2.length-1-i];
				str2[str2.length-1-i]=t;
		}
	
		for(String pos:str2)
			System.out.print(pos+" ");

	KB.close();
	}

}


/* 
 * Enter the String : Hello this is Arijit
 * Arijit is this Hello
 * 
 */