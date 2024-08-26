package methodOverloading;

public class summ {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {

		
		summ s = new summ();
		System.out.println("a+b = "+s.sum(1, 1));
		System.out.println("a+b+c = "+s.sum(3, 3, 3));
	}

}
