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
		    	System.out.println("�ki");
		    	break;
		    case 3:
		    	System.out.println("��");
		    	break;
		    case 4:
		    	System.out.println("D�rt");
		    	break;
		    default	:
		    	System.out.println("Ge�ersiz Say�...");
		    	
		}
				
	}
}
