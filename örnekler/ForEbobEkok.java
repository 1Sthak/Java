import java.util.Scanner;

public class ForEbobEkok {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int s1, s2, ebob = 1, islem, ekok;
		System.out.println("iki sayý giriniz");
		s1 = giris.nextInt();
		s2 = giris.nextInt();
		
		int min = (s1 < s2) ? s1 : s2;
				for(int i = min; i > 0;i--) {
			if ((s1 % i == 0) && (s2 % i == 0)) {
				ebob = i;
				break;
				}	
		}
		ekok = (s1*s2) / ebob;
			System.out.println("EBOB = " + ebob);
			System.out.println("EKOK = " + ekok);		
	}
}