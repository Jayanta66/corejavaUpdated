package codingPracticeForJavaInterview.array;

public class FindSmallestNumberOfArray {

	public static void main(String[] args) {

		int[] numbers = {3,4,5,8,2};
		int smallest = findSmallest(numbers);
		System.out.println("Find Smallest Number Of Array = "+smallest);
	}

	public static int findSmallest(int[] array) {
		int smallest = array[0];
		for(int i=0; i<array.length;i++) {
			if(smallest>array[i]) {
				smallest = array[i];
			}
		}
		return smallest;
	}
	
}
