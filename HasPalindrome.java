package Com.DeepanshuSir.String;

import java.util.Scanner;

class HasPalindrome {
	
	public static boolean ispalendrom(String str) {
		int l=str.length()-1;
		for(int i=1;i<l/2+1;i++) {
			if(!(str.charAt(i)==str.charAt(l-i)))
			return false;
		}
		return true;
	}
	
	public static void main(String[] as) {
		HasPalindrome p1=new HasPalindrome();
		System.out.println("Enter lies : ");
		Scanner KB=new Scanner(System.in);
		String s=KB.next();
		char[] c=s.toCharArray();
		for(int i=0;i<c.length-1;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					char t=c[i];
					c[i]=c[j];
					c[j]=t;		
				}
			}						
		}
		
		int count=0;
		for (int i=0;i<s.length()/2;i++) {
			for (int j=0;j<s.length();j++) {
				if (s.charAt(i)==s.charAt(j))
					count++;			
			}
			count=0;
		}
	
		String temp="";
		for(int i=0;i<c.length;i++) {
			if(i%2==0)
				temp+=c[i];		
		}
		for(int i=c.length-1;i>0;i--) {
			if(i%2!=0)
				temp+=c[i];
		}
	
		ispalendrom(temp);
		if(p1.ispalendrom(temp)==false)
			System.out.println("string can't be converted to  palendrom ");
		if(p1.ispalendrom(temp)==true) {
			System.out.print("string can be converted to palendrom :");
			System.out.print(temp);
		}
	KB.close();
	}
}
