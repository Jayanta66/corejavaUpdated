package AbstractClass;

abstract class animal{
	public abstract void eat();
	
}

class Dog extends animal{
	public  void eat() {
		System.out.println("eating");
	}

}

class Tiger extends animal{
	public  void eat() {
		System.out.println("eatinggggg");
	}

}

public class AbstractClass {

	public static void main(String[] args) {

		
		animal referrnce = new Dog();
		referrnce.eat();
		
		animal referrnce2 = new Tiger();
		
		referrnce2.eat();

	}

}
