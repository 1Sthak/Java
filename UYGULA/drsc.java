package UYGULA;

import java.util.Scanner;

public class drsc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sayi = scan.nextInt();
				
		switch(sayi) {
		
		    case 1:
		    	System.out.println("Bir");
		    	break;
		    case 2:
		    	System.out.println("Ýki");
		    	break;
		    case 3:
		    	System.out.println("Üç");
		    	break;
		    case 4:
		    	System.out.println("Dört");
		    	break;
		    default	:
		    	System.out.println("Geçersiz Sayý...");
		    	
		}
				
	}
}
