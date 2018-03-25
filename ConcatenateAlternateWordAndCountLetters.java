package Com.DeepanshuSir.String;

import java.util.Scanner;

public class ConcatenateAlternateWordAndCountLetters {

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

		//creating new string array
		String[] str2=new String[space+1];
		
		
		//coping in string array
		int j=0;
		String temp="";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				temp+=str.charAt(i);
			}
			else {
				str2[j]=temp;
				temp="";
				j++;
			}
		}
		  str2[j]=temp;
				
				
		//adding indexes and counting
		temp="";
		int count=0,x=0;
		for(int i=0; i<str2.length/2; i++) {
			temp+=str2[str2.length-1-i]+str2[i];
			count=temp.length();
			str2[i]=temp+count;
			temp="";
			
			x=str2.length-1-i;
			if(x>=str2.length/2 && x<=str2.length-1-i) {
				str2[x]="";
				x--;
			}
		}
		
		System.out.print("Result is : ");
		for(String pos:str2)
			System.out.print(pos+" ");
		
	KB.close();
	}
}