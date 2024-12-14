package bss;

class Animal2 {
	void eat() {

		System.out.println("i am eating");
	}
}

public class Dog2 extends Animal2 {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.eat();
	}

}
