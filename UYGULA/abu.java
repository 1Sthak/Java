package UYGULA;

public class abu {

	public static void main(String[] args) {
		char[][] ogrenciCevabi = {
				{'A' , 'B' , 'A' , 'C' , 'C' , 'D' , 'E' , 'E' , 'A' , 'D' },
				{'E' , 'C' , 'D' , 'A' , 'B' , 'B' , 'A' , 'C' , 'E' , 'C' },
				{'A' , 'A' , 'A' , 'A' , 'A' , 'A' , 'A' , 'A' , 'A' , 'A' },
				{'B' , 'A' , 'D' , 'C' , 'C' , 'A' , 'D' , 'E' , 'E' , 'B' },
				{'D' , 'B' , 'D' , 'C' , 'C' , 'D' , 'A' , 'E' , 'A' , 'E' }};
		char[] cevapAnahtari = {'D' , 'B' , 'D' , 'C' , 'C' , 'D' , 'A' , 'E' , 'A' , 'E' };
		for(int i=0;i<ogrenciCevabi.length;i++) {
			int sayac=0;
			for(int j=0;j<ogrenciCevabi[i].length;j++) {
				if (ogrenciCevabi[i][j]==cevapAnahtari[j])
					sayac++;
			}
			System.out.println((i+1) + (". ") + "öðrencinin puaný: " + sayac*100/(cevapAnahtari.length));
		}
	}
}
