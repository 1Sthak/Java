import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		for(int i = 0;i <= 10;i++) {
			if(i == 4 || i == 9) {
				continue;
			}
			System.out.println("i= " + i);
		}
		
	}
}
