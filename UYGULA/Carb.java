package UYGULA;

public class Carb {
	
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	public Carb(String color,String model) {
		this(color,model,0,0);
	}
	public Carb() {
		/*this.color = "Bilgi Yok";
		this.model = "Bilgi Yok";
		this.engine = 0;
		this.doors = 0;*/
		this("Bilgi Yok","Bilgi Yok",0,0);
	}
	public Carb(String color,String model,double engine,int doors) {
		this.color = color;
		this.engine = engine;
		this.doors = doors;
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
    public String getColor() {
    	return this.color;
    }
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		if (doors == 2 || doors == 4) {
			this.doors = doors;
		}
		else {
			System.out.println("Kapý sayýsý sadece 2 veya 4 olabilir!");
		}
		
		this.doors = doors;
	}
	public void Start() {
		System.out.println("Araba Çalýþtý...");
	}
	public void Stop() {
		System.out.println("Araba durdu...");
	}
	public void showInfos() {
		System.out.println("Arabanýn Rengi: " + this.color);
		System.out.println("Arabanýn Modeli: " + this.model);
		System.out.println("Arabanýn Motor Hacmi: " + this.engine);
		System.out.println("Arabanýn Kapý Sayýsý: " + this.doors);
	}
}
