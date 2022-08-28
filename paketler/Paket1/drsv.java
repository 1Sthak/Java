package polymorphism;

public class Animal {
	private String name;

	public Animal(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.println("Hayvan Konuþuyor...");
	}

}
class Bird extends Animal {

	public Bird(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		System.out.println(getName() + " ötüyor...");
	}
}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		System.out.println(getName() + " havlýyor...");
	}
}
class Horse extends Animal {

	public Horse(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		System.out.println(getName() + " kiþniyor...");
	}
}

public class drsv {
public static void main(String[] args) {
	Animal animal = new Animal("Hayvan");
	Bird bird = new Bird("Limon");
	Dog dog = new Dog("Karabaþ");
	Horse horse = new Horse("Þahbatur");
	
	/*animal.speak();
	bird.speak();
	dog.speak();
	horse.speak();*/
	
	Animal animal2 = new Bird("Limon");
	animal2.speak();
  }

}
