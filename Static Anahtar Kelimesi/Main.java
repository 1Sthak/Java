
public class Main {

	public void deneme() {
		System.out.println("Deneme");
	}
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		System.out.println("Öğrenci sayısı: " + Student.no_of_students + " " + Student.deneme());

	}
}
