package UYGULA;

import java.util.Scanner;

public class odvf {
public static void main(String[] args) {

	char c1=(char)(Math.random()*26+65);
	char c8=(char)(Math.random()*26+97);
	char c7[]= {'%','*','+','?','&','!'};
	int secilenkarakter=(int)(Math.random()*6);
	
	String orta="";
	for(int i=1;i<=8;i++) {
		int uretilensayi=(int)(Math.random()*3+1);
		char o='\u0000';
	switch(uretilensayi) {
	case 1:o=(char)(Math.random()*26+65);break;
	case 2:o=(char)(Math.random()*26+97);break;
	case 3:o=(char)(Math.random()*10+48);
	}
		orta=orta+o;
    }
	String parola= c1+orta+c7[secilenkarakter]+c8;
	System.out.println("Üretilen parola: " + parola);
	System.out.println("parola uzunluðu: " + parola.length());
	}
}
