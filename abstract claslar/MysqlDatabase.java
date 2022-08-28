
public class MysqlDatabase extends AbstractDatabase {

	@Override
	void update() {
		System.out.println("Mysql Güncelledi...");
		
	}

	@Override
	void get() {
		System.out.println("Mysql verileri aldý...");
		
	}

}
