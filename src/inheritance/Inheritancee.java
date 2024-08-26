package inheritance;

class A{
	void name() {
		System.out.println("Hellow");
	}
}


public class Inheritancee extends A {
	
	void name() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {

		Inheritancee inheritancee = new Inheritancee();
		inheritancee.name();
	}

}
