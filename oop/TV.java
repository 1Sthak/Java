package oop;

public class TV {

	int kanal, sesDuzeyi;
	boolean acKapa;
	
	public TV() {
	kanal=1;
	sesDuzeyi=3;
	acKapa=false;
	}
	public void tvAc() {	acKapa=true;	}
	public void tvKapat() {		acKapa=false;	}
	public void kanalAyarla(int kanalNo) {
		if(acKapa==true && kanalNo>=1 && kanalNo<=120)
			kanal=kanalNo;
	}
	public void sesAyarla(int yeniDuzey) {
		if(acKapa==true && yeniDuzey>=1 && yeniDuzey<=7)
			sesDuzeyi=yeniDuzey;
	}
	public void kanalYukari() {
		if(acKapa==true && kanal < 120)
			kanal++;
	}
	public void kanalAsagi() {
		if(acKapa==true && kanal > 1)
			kanal--;
	}
	public void sesArttir() {
		if(acKapa==true && sesDuzeyi < 7)
			sesDuzeyi++;
	}
	public void sesAzalt() {
		if(acKapa==true && sesDuzeyi > 1)
			sesDuzeyi--;
	}
}
	