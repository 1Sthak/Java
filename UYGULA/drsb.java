package UYGULA;

import java.util.Scanner;

public class drsb {

	public static void main(String[] args) {
		
	/*
	 * ! (Not Operatörü)
	 * Kullanýmý: !(3 > 4)
	 * Anlamý: true bir deðeri false, false bir deðeri true yapar
	 * 
	 * && (And Operatörü)
	 * Kullanýmý: (3 > 4) && ("yazýlým" == "yazýlým")
	 * Anlamý:
	 * true, true ------> true
	 * false, true -----> false
	 * true, false -----> false
	 * false, false ----> false
	 * 
	 * || (Or Baðlacý]
	 * Kullanýmý : (3 > 4) || ("yazýlým" == "yazýlým")
	 * true, true ------> true
	 * false, true -----> true
	 * true, false -----> true
	 * false, false ----> false
	 * 
	 *  	
	 */
		
		System.out.println("Sonuç " + !(3 > 4));
		System.out.println("Sonuç " + ((3 > 4) && ("yazýlým" == "yazýlým")));
		System.out.println("Sonuç " + ((3 > 4) || ("yazýlým" == "yazýlým")));
		
		// Kulanýcý adý giriþi
		String sys_kul_adý = "yazilimbilimi";
	    String parola = "12345";
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Kullanýcý Adý: ");
	    
	    String kullanýcý_adý = scan.nextLine();
	    System.out.println("Parola: ");
	    
	    String kul_parola = scan.nextLine();
	    	    
	    if ( !( sys_kul_adý.equals(kullanýcý_adý)) && !(parola.equals(kul_parola))){
	   	System.out.println("Kullanýcý adý ve parola yanlýþ...");
	    }
	    else if ( ( sys_kul_adý.equals(kullanýcý_adý)) && !(parola.equals(kul_parola))){
	    System.out.println("Parola yanlýþ...");
	    }	
	    else if (!( sys_kul_adý.equals(kullanýcý_adý)) && (parola.equals(kul_parola))) {
	    System.out.println("Kullanýcý adý yanlýþ...");
	    }
	    else {
	    System.out.println("Hoþgeldiniz...");	
	    }
	}

}

