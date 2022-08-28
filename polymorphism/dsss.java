

public class dsss {
	
		private String name;

		public dsss(String name) {

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
	class Bird extends dsss {

		public Bird(String name) {
			super(name);
			
		}

		@Override
		public void speak() {
			System.out.println(getName() + " ötüyor...");
		}
	}

	class Dog extends dsss {

		public Dog(String name) {
			super(name);
			
		}

		@Override
		public void speak() {
			System.out.println(getName() + " havlýyor...");
		}
	}
	class Horse extends dsss {

		public Horse(String name) {
			super(name);
			
		}

		@Override
		public void speak() {
			System.out.println(getName() + " kiþniyor...");
		}
	}



