import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		
		double sayi1;
		double sayi2;
		int secim;
		String a ="Ge�ersiz ��lem";
		
		System.out.println("�lk Say�y� Giriniz : ");
		sayi1 = giris.nextDouble();
		
		System.out.println("�kinci Say�y� Giriniz : ");
		sayi2 = giris.nextDouble();
		
		System.out.println("\nL�tfen Yapmak �stedi�iniz ��lemi Se�iniz : ");
		System.out.println("1-) Toplama\n2-) ��karma\n3-) �arpma\n4-) B�lme");
		secim = giris.nextInt();
		
		if(secim==1) {
			System.out.println("Toplama : " + (sayi1 + sayi2));		
		}
		else if(secim==2) {
			System.out.println("��karma : " + (sayi1 - sayi2));		
		}
		else if(secim==3) {
			System.out.println("�arpma : " + (sayi1 * sayi2));
		}
		else if(secim==4){
			System.out.println("B�lme : " + (sayi1 / sayi2));
		}
		else {
			System.out.println("Ge�ersiz ��lem\nGe�erli Bir ��lem Giriniz : ");
		}
	}
}
