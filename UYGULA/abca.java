package UYGULA;

import java.util.Scanner;

public class abca {

	public static void main(String[] args) {
		Scanner giris= new Scanner(System.in);
		String []sorular = new String[5];
		sorular[0]="A��a��dakilerden hangisi tam say� tipidir?";
		sorular[1]="Verilerden hangisi mant�ksal tiptir?";
		sorular[2]="Se�eneklerden hangisi ondal�k tiptir?";
		sorular[3]="Se�eneklerden hangisi bir d�ng� de�ildir";
		sorular[4]="Verilenlerden hangisi karakter tipidir";
		
		int soruNo=(int)(Math.random()*5);
		System.out.println(sorular[soruNo]);
		
		String[][]secenekler= {{"int","double","boolean","float","char"},
								{"int","long","boolean","String","char"},
								{"int","double","boolean","long","char"},
								{"for","for-each","do-while","while","switch-case"},
								{"int","double","boolean","byte","char"}
								};
		String[][]cevapAnahtari= {{"int"},
								{"boolean"},
								{"double"},
								{"switch-case"},
								{"char"}
								};
		for(int i=0;i<secenekler.length;i++) {
			char c=(char)(65+i);
			System.out.println(c+")"+secenekler[soruNo][i]+"  ");
		}
		System.out.print("Cevab�nz Nedir?");
		String cevap=giris.nextLine();
		if(cevap.equals(cevapAnahtari[soruNo][0]))
			System.out.println("Cevab�n�z do�ru...");
		else
			System.out.println("Cevab�n�z yanl��, do�ru cevap: " + cevapAnahtari[soruNo][0]);
			
		}
		
	}