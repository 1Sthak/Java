
public class Main {
	public static void main(String[] args) {
	//IDatabase database = new IDatabase(); 	
	
		IDatabase database1 = new Customer();
		IDatabase database2 = new Student();
		
		database1.log();
		database2.log();
		
	}
}
