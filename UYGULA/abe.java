package UYGULA;

import java.util.Scanner;

public class abe {

	public static void main(String[] args) {	
    Scanner giris=new Scanner(System.in);
    
    int sayi1=(int)(Math.random()*10+1);//1 ile 11 aras�nda 11 dahil de�il
    int sayi2=(int)(Math.random()*10+1);
    
    System.out.println(sayi1+"*"+sayi2+"=?");
    int cevap=giris.nextInt();
    int sayac=1;
    
    while(sayi1*sayi2 != cevap){
    	sayac++;
    	System.out.println("Cevab�n�z Yanl��");
    	sayi1=(int)(Math.random()*10+1);
    	sayi2=(int)(Math.random()*10+1);
    	System.out.println(sayi1+"*"+sayi2+"=?");
    	cevap=giris.nextInt();
    }
System.out.println("Tebrikler...\n"+sayac+".Defada bildiniz");

		
		
		
		
		
		
		
		
		
		
		
	}
}
