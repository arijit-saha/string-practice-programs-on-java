package Com.DeepanshuSir.String;

/* STRING IS ALWAYS IMMUTABLE */

public class ImmutableStringClass {
	
	public static void main(String[] args) {
		
		String s=new String("ABCD12345");
		System.out.println(s);
		
		//not possible because of final data member in String class.
		/*String s=new String("ABCD12345");
		System.out.println(s);*/
		
		String s1=new String("ABCD12345");
		System.out.println(s1);
	}
}