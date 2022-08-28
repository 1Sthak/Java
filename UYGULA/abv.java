package UYGULA;

public class abv {

	public static void main(String[] args) {
		char[][]cevaplar=new char[41][20];
		char[] cevapAnahtari = {'D' , 'B' , 'D' , 'C' , 'C' , 'D' , 'A' , 'E' , 'A' , 'E' , 'A' , 'B' , 'A' , 'C' , 'D' , 'C' , 'A' , 'B' , 'C' };
		for(int i=0;i<cevaplar.length;i++) {
			int sayac=0;
			for(int j=0;j<cevaplar[i].length;j++) {
				cevaplar[i][j]=(char)(Math.random()*5+65);
				if (cevaplar[i][j]==cevapAnahtari[j])
					sayac++;
			}
			System.out.println((". ") + "öðrencinin puaný: " + sayac*100/(cevapAnahtari.length));
		}
	}
}
