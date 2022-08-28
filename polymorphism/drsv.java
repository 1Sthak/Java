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
		System.out.println("Hayvan Konu�uyor...");
	}

}
class Bird extends Animal {

	public Bird(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		System.out.println(getName() + " �t�yor...");
	}
}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		System.out.println(getName() + " havl�yor...");
	}
}
class Horse extends Animal {

	public Horse(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		System.out.println(getName() + " ki�niyor...");
	}
}

public class drsv {
public static void main(String[] args) {
	Animal animal = new Animal("Hayvan");
	Bird bird = new Bird("Limon");
	Dog dog = new Dog("Karaba�");
	Horse horse = new Horse("�ahbatur");
	
	/*animal.speak();
	bird.speak();
	dog.speak();
	horse.speak();*/
	
	Animal animal2 = new Bird("Limon");
	animal2.speak();
  }

}
