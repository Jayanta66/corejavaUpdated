package codingPracticeForJavaInterview.array;

public class ArrayLength {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
		int length = arrayLength(numbers);
		System.out.println(length);
	}

	private static int arrayLength(int[] array) {

		int length = array.length;
		
		return length;
	}

}
