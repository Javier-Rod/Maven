package MavenGrp.MavenDemo;

class Animal{
	public Animal() {
		System.out.println("I'm a super constructor");
	}
	public String color = "White";
	public void disp() {
		System.out.println("I'm in the disp method");
	}
}

class Dog extends Animal{
	public Dog() {
		//System.out.println("Testing Begins");
		super(); //Call first the super constructor
		System.out.println(super.color);
		super.disp();
	}
	public String color = "Black";
	public void disp() {
		System.out.println("I'm in the disp child method");
		
	}
}

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello Main class");
		//Dog dg = new Dog();
		//dg.disp();
		//System.out.println(dg.color);
	}
}
