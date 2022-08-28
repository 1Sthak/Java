package UYGULA;

public class drsu {

	public static void main(String[] args) {
		Employee employee = new Employee("Taha Konyar","Amazon Yapay Zeka Mühendisliði",6000);
		
		employee.showInfos();
		
		Manager manager = new Manager("Taha Konyar","Amazon Yapay Zeka Mühendisliði",6000,10);
		/*manager.showInfos();
		manager.raiseSalary(100);*/

		Employee emloyee = new Manager("Taha Konyar","Amazon Yapay Zeka Mühendisliði",6000,10);
		employee.showInfos();
		
		//System.out.println(manager);
	}
}
