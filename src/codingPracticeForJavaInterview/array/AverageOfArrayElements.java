package codingPracticeForJavaInterview.array;

public class AverageOfArrayElements {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
		double average = calculateAverage(numbers);
		System.out.println("Average Of Array Elements =  "+average);
	}
	
	public static double calculateAverage(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum = sum+array[i];
		}
		return (double) sum/array.length;
	}

}
