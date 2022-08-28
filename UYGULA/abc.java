 package UYGULA;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
	Scanner giris=new Scanner(System.in);
	String ad,harfNotu;
	double vize, finall, gecerNot=0;
	
	System.out.print("Öðrencinin adýný girin");
	ad=giris.nextLine();
	System.out.print("Öðrncinin Vize Notunu girin");
	vize=giris.nextDouble();
	System.out.print("Öðrencinin final notunu girin");
	finall=giris.nextDouble();
	//hesaplamalar
	vize=vize*0.40;
	if (finall>=50) {
		finall=finall*0.60;
		gecerNot=vize+finall;	
	}
	else
		System.out.println("Nihai not hesaplanamaz... ");
	if(gecerNot>=0 && gecerNot<=34)
		harfNotu="FF";
	else if (gecerNot>=35 && gecerNot<=39)
		harfNotu="FD";
	else if (gecerNot>=40 && gecerNot<=44)
	    harfNotu="DD";
	else if (gecerNot>=45 && gecerNot<=49)
        harfNotu="DC";	
	else if (gecerNot>=50 && gecerNot<=59)
		harfNotu="CC";
	else if (gecerNot>=60 && gecerNot<=69)
		harfNotu="CB";
	else if (gecerNot>=70 && gecerNot<=79)
		harfNotu="BB";
	else if (gecerNot>=80 && gecerNot<=89)
		harfNotu="BA";
	else
		harfNotu="AA";
    System.out.println(ad+" isimli öðrencinin geçer notu:"+harfNotu);
    }//main sonu 



}
