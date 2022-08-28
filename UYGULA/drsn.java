package UYGULA;

public class drsn {
public static void main(String[] args) {
	
	Carb car1 = new Carb("Gümüþ","Renoult Megane 1",1.6,4);
	Carb car2 = new Carb();
	Carb car3 = new Carb("Siyah","Mercedes",0,0);
	/*car1.setColor("Gümüþ");
	car1.setModel("Renoult Megane 1");
	car1.setEngine(1.6);
	car1.setDoors(4);*/
	
	System.out.println("Arabanýn Rengi: " + car1.getColor());
	System.out.println("Arabanýn Modeli: " + car1.getModel());
	System.out.println("Arabanýn Motor Hacmi: " + car1.getEngine());
	System.out.println("Arabanýn Kapý Sayýsý: " + car1.getDoors());
	car1.Start();
	car1.Stop();
	car1.showInfos();
	car2.showInfos();
	car3.showInfos();
    }
}
