package UYGULA;
import java.util.Scanner;
public class abd {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		
		System.out.print("Kilonuzu giriniz (Kg): ");
		
		double kilo=giris.nextDouble();
		
		System.out.print("Boyunuzu giriniz (m): ");
		 double boy=giris.nextDouble();
		double bmi=0;
		
		if (kilo<0 )
			System.out.println("Bilgiler negatif olamaz");
		else {
		      bmi=kilo/(boy*boy);
		String sonuc="";
		if(bmi<18.5)
			sonuc="Düþük kilolu";
		else if (bmi>=18.5 && bmi<25.0)
		    sonuc="Normal kilolu";
		else if (bmi>=25.0 && bmi<30.0)
			sonuc="Aþýrý kilolu";
		else if (bmi>=30.0)
			sonuc="Obez";
		
		System.out.println(kilo+" kilo "+boy+" m boylu kiþi "+sonuc+ "dýr");
		
		
	}
	
		
	
		
	}
}
