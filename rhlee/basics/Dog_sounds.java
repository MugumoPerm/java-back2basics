class Dog {
	String name;
	String says;
}

public class Dog_sounds {
	public static void main(String[] args) {
		Dog a = new Dog();

		a.name = "spot";
		a.says = "Ruff!";

		Dog b = new Dog();

		b.name = "scruffy";
		b.says = "Wurf";

		Dog c = new Dog();

		c = a;

		System.out.println(c == a);
		System.out.println(a.name == c.name);

		System.out.println(a.name.isEmpty() && c.name.isEmpty());

	}
}
