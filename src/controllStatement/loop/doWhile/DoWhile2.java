package controllStatement.loop.doWhile;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;
		do {
		System.out.println("Enter a number : ");
		
		number = scanner.nextInt();
		
		System.out.println("Cube is : "+(number*number*number));
		}while(number>=0);
	}

}
