package UYGULA;

import java.util.Scanner;

public class drsh {
	public static void main(String[] args) {
		
		
		 // Break - D�ng�y� sona erdirir
		 // Continue - Alt�ndaki i�lemleri yapmadan d�ng�n�n en ba��na gider
		 
		while(true) {
			Scanner scan = new Scanner(System.in);
			String s;
			
			System.out.println("Karakter giriniz: ");
			s = scan.nextLine();
			
			if (s.equals("q")) {
				
				System.out.println("Programdan ��k�l�yor...");
				break;
			}
			System.out.println("Karakter: " + s);		}
		
		int i = 0;
		
		while(i < 10) {
			
			if(i == 4 || i == 7) {
				i++;
				continue;
			}
			
			System.out.println("i : " + i);
			i++;
			
			
		}
		
		
	}
}
