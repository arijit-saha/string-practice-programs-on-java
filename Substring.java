package Com.DeepanshuSir.String;
/* substring inside string present or not */

import java.util.Scanner;

class  Substring {	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String s1=s.nextLine();
		
		System.out.print("Enter the SubString : ");
	    String s2=s.nextLine();
		
	    String temp="";
		int j=0;
        for (int i=0; i<s1.length(); i++) {
			if (j<s2.length() && (s1.charAt(i)==s2.charAt(j))) {
				temp+=s1.charAt(i);
				j++;
			}
		}
        
        
		if(s2.equalsIgnoreCase(temp)) {
			System.out.println("Given string is substring");
		}
		else {
			System.out.println("Given string is not substring");
		}
        
    s.close();
	}
}


