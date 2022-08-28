package oop;

public class masa1 {
	
	public static void main(String[] args) {

		masa m1 = new masa();
		System.out.println("Masa eni: " + m1.enOku() + "\nMasa boyu: " + m1.boyOku() + "\nRengi: " + m1.renkOku());
		System.out.println("\n");
		m1.renkDegistir("Turkuvaz");
		System.out.println("Masa eni: " + m1.en + "\nMasa boyu: " + m1.boy + "\nRengi: " + m1.renk);
	}

class bizimMasa {
	int en = 80, boy = 120;
	String renk = "Beyaz";


	public bizimMasa(int en, int boy, String renk) {
		this.en = en;
		this.boy = boy;
		this.renk = renk;
	}

	public bizimMasa(int en, int boy) {
		this.en = en;
		this.boy = boy;
		this.renk = "Kahverengi";
	}

	public int enOku() {
		return en;
	}

	public int boyOku() {
		return boy;
	}

	public String renkOku() {
		return renk;
	}

	public void renkDegistir(String renk) {
		this.renk = renk;
	}

}
}
