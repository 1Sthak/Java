import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		String kul_adi, parola, data_kul_adi, data_parola;
		data_kul_adi = "konyartaha1905";
	    data_parola = "1St.aha00";
		System.out.println("Kullan�c� Ad� Giriniz : ");
		kul_adi = giris.nextLine();
		System.out.println("Parola Giriniz : ");
		parola = giris.nextLine();
	    
	    
	    if(data_kul_adi.equals(kul_adi) && data_parola.equals(parola)) {
	    	System.out.println("Ho�geldin " + kul_adi + " ^-^");
	    }
	    else {
	    	System.out.println("Sizi Tan�yamad�k... " + kul_adi);
	    }
	}
}