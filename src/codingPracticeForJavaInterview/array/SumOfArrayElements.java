package codingPracticeForJavaInterview.array;

public class SumOfArrayElements {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
		
		int sum = calculateSum(numbers);
		System.out.println(sum);
	}

	private static int calculateSum(int[] numbers) {

		int sum =0;
		for(int i=0; i<numbers.length; i++) {
			sum = sum+numbers[i];
		}
		return sum;
	}

}
