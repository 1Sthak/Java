package UYGULA;

import java.util.Scanner;

public class drsb {

	public static void main(String[] args) {
		
	/*
	 * ! (Not Operat�r�)
	 * Kullan�m�: !(3 > 4)
	 * Anlam�: true bir de�eri false, false bir de�eri true yapar
	 * 
	 * && (And Operat�r�)
	 * Kullan�m�: (3 > 4) && ("yaz�l�m" == "yaz�l�m")
	 * Anlam�:
	 * true, true ------> true
	 * false, true -----> false
	 * true, false -----> false
	 * false, false ----> false
	 * 
	 * || (Or Ba�lac�]
	 * Kullan�m� : (3 > 4) || ("yaz�l�m" == "yaz�l�m")
	 * true, true ------> true
	 * false, true -----> true
	 * true, false -----> true
	 * false, false ----> false
	 * 
	 *  	
	 */
		
		System.out.println("Sonu� " + !(3 > 4));
		System.out.println("Sonu� " + ((3 > 4) && ("yaz�l�m" == "yaz�l�m")));
		System.out.println("Sonu� " + ((3 > 4) || ("yaz�l�m" == "yaz�l�m")));
		
		// Kulan�c� ad� giri�i
		String sys_kul_ad� = "yazilimbilimi";
	    String parola = "12345";
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Kullan�c� Ad�: ");
	    
	    String kullan�c�_ad� = scan.nextLine();
	    System.out.println("Parola: ");
	    
	    String kul_parola = scan.nextLine();
	    	    
	    if ( !( sys_kul_ad�.equals(kullan�c�_ad�)) && !(parola.equals(kul_parola))){
	   	System.out.println("Kullan�c� ad� ve parola yanl��...");
	    }
	    else if ( ( sys_kul_ad�.equals(kullan�c�_ad�)) && !(parola.equals(kul_parola))){
	    System.out.println("Parola yanl��...");
	    }	
	    else if (!( sys_kul_ad�.equals(kullan�c�_ad�)) && (parola.equals(kul_parola))) {
	    System.out.println("Kullan�c� ad� yanl��...");
	    }
	    else {
	    System.out.println("Ho�geldiniz...");	
	    }
	}

}

