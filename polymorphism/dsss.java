

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
			System.out.println("Hayvan Konu�uyor...");
		}

	}
	class Bird extends dsss {

		public Bird(String name) {
			super(name);
			
		}

		@Override
		public void speak() {
			System.out.println(getName() + " �t�yor...");
		}
	}

	class Dog extends dsss {

		public Dog(String name) {
			super(name);
			
		}

		@Override
		public void speak() {
			System.out.println(getName() + " havl�yor...");
		}
	}
	class Horse extends dsss {

		public Horse(String name) {
			super(name);
			
		}

		@Override
		public void speak() {
			System.out.println(getName() + " ki�niyor...");
		}
	}



