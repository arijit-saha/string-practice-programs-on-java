package Com.DeepanshuSir.String;

final class Employee {  
	private final String pancardNumber;  
  	
	public Employee(String pancardNumber) {  
		this.pancardNumber=pancardNumber;  
	}
  
	public String getPancardNumber() {  
		return pancardNumber;  
	}
}

public class ImmutableClass {
	
	public static void main(String[] args) {
		
		Employee e=new Employee("ABCD123456");
		System.out.println(e.getPancardNumber());
		
		//not possible because of final data member in Employee class.
		/*Employee e=new Employee("XYZ123456");
		System.out.println(e.getPancardNumber());*/
		
		
		Employee e1=new Employee("ABCD123456");
		System.out.println(e1.getPancardNumber());
		
	}
}