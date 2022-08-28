package oop;

public class masa {
	int en = 80, boy = 120;
	String renk = "Beyaz";

	public masa() {

	}

	public masa(int en, int boy, String renk) {
		this.en = en;
		this.boy = boy;
		this.renk = renk;
	}
	public masa(int en, int boy) {
		this.en = en;
		this.boy = boy;
		this.renk = "Kahverengi";
	}
	public int enOku() {return en;}
	public int boyOku() {return boy;}
	public String renkOku() {return renk;}
	public void renkDegistir(String renk) {
		this.renk = renk;
	}
	
	public static void main(String[] args) {

		masa m1 = new masa();
		System.out.println("Masa eni: " + m1.enOku() + "\nMasa boyu: " +m1.boyOku() + "\nRengi: " + m1.renkOku());
		System.out.println("\n");
		m1.renkDegistir("Turkuvaz");
		System.out.println("Masa eni: " + m1.en + "\nMasa boyu: " + m1.boy + "\nRengi: " + m1.renk);
	}

}
