package UYGULA;

public class abl {
public static void main(String[] args) {
	
	int d_1 = 0;
	int d_2 = 0;
	
	for(int i=1;i<=100;i++) {
			int us =(int)(Math.random() + 0.5);
	if(us==1)
		d_1++;
	else
		d_2++;
	}
System.out.println("Birler: " + d_1);
System.out.println("Sýfýrlar: " + d_2);
}
}
// sor