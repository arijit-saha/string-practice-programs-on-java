package Com.DeepanshuSir.String;
//wrong
import java.util.Scanner;

public class CountDuplicateWords {
	
	//count words
	static int space=0;
	private static int countWord(String arg) {
		for(int i=0; i<arg.length(); i++) {
			if(arg.charAt(i)==' ' && arg.charAt(i+1)!=' ')
				space++;
		}
	return space;
	}

	//to lower case
	private static String toLowerCase(String arg) {
		String temp="";
		for(int i=0; i<arg.length(); i++) {
			if(arg.charAt(i)>=67 && arg.charAt(i)<=90)
				temp+=arg.charAt(i)+32;
			else if(arg.charAt(i)>=90 && arg.charAt(i)<=122)
				temp+=arg.charAt(i);
			else
				temp+=arg.charAt(i);
		}
	return temp;
	}


	//count duplicate
	private static int countDuplicate(String[] arg) {
		int count=0;
		for(int i=0; i<arg.length; i++) {
			for(int j=i+1; j<arg[i].length(); j++) {
				if(arg[i].charAt(j)==arg[i].charAt(j)) {}
				count++;
			}
		}
	return count;
	}

	
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		String str=KB.nextLine();
		
		str=toLowerCase(str);
		int space=countWord(str);
		
		String[] str2=new String[space+1];
		
			int countDuplicate=0;
			countDuplicate=countDuplicate(str2);

			//display
			for(int i=0; i<str2.length; i++) {
				System.out.println("str2[i] : "+countDuplicate);
			}
		KB.close();
		}
	}
