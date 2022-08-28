import java.util.Scanner;

public class UcgenYapma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		int i = 1;
		while(i <= star) {
			int k = 1;
			while(k <= i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}
}