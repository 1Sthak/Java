package UYGULA;

import java.util.Scanner;

public class odvg {
	public static String sifcontrol(char a) {
		if (Character.isDigit(a))
		 return "Geçerli parola"; 
		else if (Character.isUpperCase(a))
		 return "Geçerli parola";	
		else 
		 return "Geçersiz parola";
	  
	}
	public static void main(String[] args) {
		
	Scanner giris=new Scanner(System.in);
	System.out.println("Bir parola giriniz: " );
	String sifre= giris.nextLine();	
	System.out.println(sifcontrol(sifre.charAt(0)) + sifcontrol(sifre.charAt(1)));
	
	
	
	}
	
}
