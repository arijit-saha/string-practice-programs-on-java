package Com.DeepanshuSir.String;

import java.util.Scanner;

public class CountLettersInEachString {

	public static void main(String[] args) {
		
		//input from keyboard
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=KB.nextLine();
		
		
		//remove extra space between words
		String tmp="";
		  for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==' ' && str.charAt(i+1)==' ') {
					tmp+="";
				}
				else {
					tmp+=str.charAt(i);
				}		
		  }
		str=tmp;
		
		
		//count words
		int space=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
				space++;
		}

		//creating new string array and counting letters in each string
		String[] str2=new String[space+1];
		
		//coping in string array
		int j=0;
		String temp="";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				temp+=str.charAt(i);
				count++;
			}
			else {
				str2[j]=temp+count;
				count=0;
				temp="";
				j++;
			}
		}
		  str2[j]=temp+count;
	
		//displaying
		System.out.print("Result is : ");
		for(String pos:str2)
			System.out.print(pos+" ");

	KB.close();
	}

}