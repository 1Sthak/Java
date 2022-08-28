package oop;

public class YeniDaire {

	public static void main(String[] args) {

		System.out.println("Nesne oluşturmadan önce: " + daire1.nesneSayisi);
		daire1 d1 = new daire1();
		daire1 d2 = new daire1();
		System.out.println("Nesneden sonra: " + d1.nesneSayisi);
	}
}

	class daire1 {
		int r = 1;
		static int nesneSayisi=0;
		public daire1() {
			nesneSayisi++;
		}
		public daire1(int r) {
			this.r=r;
			nesneSayisi++;
		}
		public int nesAdedi() {
			return nesneSayisi;
		}	
	}

