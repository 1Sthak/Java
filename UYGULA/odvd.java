package UYGULA;

import java.util.Scanner;

public class odvd {
public static void main(String[] args) {
	Scanner giris=new Scanner(System.in);
	System.out.print("Bir miktar para girin (örnek: 2568,85 TL): ");
	
	double miktar = giris.nextDouble();
	int ikiyuzluk =(int)(miktar/200);
	miktar = miktar %200;
	System.out.println(ikiyuzluk + " adet 200'lük banknot ");
	
	int yuzluk =(int)(miktar/100);
	miktar = miktar %100;
	System.out.println(yuzluk + " adet 100'lük banknot");
	
	int ellilik =(int)(miktar/50);
	miktar = miktar %50;
	System.out.println(ellilik + " adet 50'lik banknot");
	
	int yirmilik =(int)(miktar/20);
	miktar = miktar %20;
	System.out.println(yirmilik + " adet 20'lik banknot");
	
	int onluk =(int)(miktar/10);
	miktar = miktar %10;
	System.out.println(onluk + " adet 10'luk banknot");
	
	int beslik =(int)(miktar/5);
	miktar = miktar %5;
	System.out.println(beslik + " adet 5'lik banknot");
	
	int birlik =(int)(miktar/1);
	miktar = miktar %1;
	System.out.println(birlik + " adet 1'lik");
	
	int vipkoruma =(int)(miktar/0.5);
	miktar = miktar %0.5;
	System.out.println(vipkoruma + " adet 50 kuruş");
	
	int sakizparasi =(int)(miktar/0.25);
	miktar = miktar %0.25;
	System.out.println(sakizparasi + " adet 25 kuruş");
	
	int onkurus =(int)(miktar/0.1);
	miktar = miktar %0.1;
	System.out.println(onkurus + " adet 10 kuruş");
	
	int beskurus =(int)(miktar/0.05);
	miktar = miktar %0.05;
	System.out.println(beskurus + " adet 5 kuruş");
	
	int birkurus =(int)(miktar/0.01);
	miktar =miktar %0.02;
	System.out.println(birkurus + " adet 1 kuruş");
}
}
