package Com.DeepanshuSir.String;

public class Print {

	public static void main(String[] args) {
		
		int plan=1;
		plan=plan++ + --plan;
		
		if(plan==1) {
			System.out.print("plan A");
		}
		else {
			if(plan==2) {
				System.out.print("plan B");
			}
			else {
				System.out.print("plan C");
			}
		}
	}
}