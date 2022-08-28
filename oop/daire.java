package oop;

public class daire {

	int r=5;
	
	public daire() {
		
	}
	public daire(int yeniR) {
		r=yeniR;
	}
	public int cap_oku() {
		return 2*r;
	}
	public double cevre_oku() {
		return 2*Math.PI*r;
	}
	public double alan_oku() {
		return Math.PI*r*r;
	}
	public void r_degistir(int yeniR) {
		r=yeniR;
	}
}
