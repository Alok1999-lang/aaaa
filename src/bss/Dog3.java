package bss;

class Animal3 {
	void eat() {

		System.out.println("i am eating");
	}
}

public class Dog3 extends Animal3 {
	public static void main(String[] args) {
		Dog3 d = new Dog3();
		d.eat();
	}

}
