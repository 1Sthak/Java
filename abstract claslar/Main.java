
public class Main {

	public static void main(String[] args) {
		AbstractDatabase abstractdatabase1 = new MysqlDatabase();
		AbstractDatabase abstractdatabase2 = new MongoDatabase();
		
		abstractdatabase1.update();
		abstractdatabase2.update();
		
		
		
	}
}
