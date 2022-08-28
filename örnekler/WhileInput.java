import java.util.Scanner;

public class WhileInput {

	public static void main(String[] args) {
		int i=0,inp;
		Scanner giris = new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz: ");
			inp = giris.nextInt();
		while(i <= inp) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
