package exception;

public class UncheckedException3 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		// ClassCastException
		changeDog(cat);

	}

	// Animal animal = dog;
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}
}
