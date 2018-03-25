package Com.DeepanshuSir.String;

import java.util.Scanner;

public class AssendingSort {

	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=KB.nextLine();
		char[] arr=str.toCharArray();
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.print("After reverse : ");
		for(char pos:arr)
			System.out.print(pos);
		KB.close();
	}
}