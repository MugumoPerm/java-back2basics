class Bird {
	Bird() {
		System.out.println("You just created a big crawled bird");
	}

	Bird(String a) {
		System.out.println(a + "You just created a big crawled bird");
	}
}


class Dog {
	Dog() {
		System.out.println("Woof");
	}

	Dog(String sound) {
		System.out.println(sound);
	}

	Dog(int a, String sound) {
		int i = 0;
		for (; i < a; i++) {
			System.out.println("Wolf");
		}
	}

	Dog(String sound, int a) {
		System.out.println(sound);
	}
}

public class Constructors {
	public static void main(String[] args) {
		Bird a = new Bird();
		Bird b = new Bird("You man");

		Dog c = new Dog();
		Dog d = new Dog("Howl");
		Dog e = new Dog(5, "meow");
		Dog f = new Dog("meow", 5);
	}
}
