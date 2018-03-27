package Com.DeepanshuSir.String;

import java.util.Scanner;

class LargestPalindrome {
	
	static void printSubStr(String str,int l,int h) {
		System.out.println(str.substring(l, h+ 1));
	}
	
	int maxlength(String str) {
		int start=0;
		int maxlength=1;
		int h,l;
		for (int i=1;i<str.length();++i) {
			l=i-1;
			h=i;
			while(l>=0&&h<str.length()&&str.charAt(l)==str.charAt(h)) {
				if (h-l+1>maxlength) {
					start=l;
					maxlength=h-l+1;
				}
				--l;
				++h;
			}
		}
		for (int i=1;i<str.length();++i	) {
			l=i-1;
			h=i+1;
			while(l>=0&&h<str.length()&&str.charAt(l)==str.charAt(h)) {
				if (h-l+1>1) {
					start=l;
					maxlength=h-l+1;
				}
				--l;
				++h;
			}
		}
		printSubStr(str,start,start+maxlength-1);
		return maxlength;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner KB=new Scanner(System.in);
		String str=KB.next();
		LargestPalindrome lp=new LargestPalindrome();
		lp.maxlength(str);
	KB.close();
	}
}
