package Com.DeepanshuSir.String;

import java.util.Scanner;

public class ReverseSentance {

	public static void main(String[] args) {
		
		//input from keyboard
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=KB.nextLine();
		

		//counting words
		int space=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
				space++;
		}
		

		//creating new string array
		String[] str2=new String[space+1];
		
		
		//coping in string array
		/*int j=0;
		String temp="";
		for(int i=0; i<str2.length; i++) {
			while(j<str.length() && str.charAt(j)!=' ') {
				temp+=str.charAt(j);
				j++;
			}
			str2[i]=temp;
			temp="";
			j++;
		}*/

		
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
		 
		
		
		for(int i=str2.length-1; i>=0; i--)
			System.out.print(str2[i]+" ");

	KB.close();
	}
}