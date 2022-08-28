
public class WhileLoop {

	public static void main(String[] args) {

		int i = 0;
		while(i <= 5) {
			System.out.print(i);
			if(i < 5) {
				System.out.print(",");
			}
			i++;
		}
		System.out.print("\nDöngü Bitti...");
	}
}
