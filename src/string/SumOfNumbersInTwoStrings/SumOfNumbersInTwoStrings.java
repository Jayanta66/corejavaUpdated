package string.SumOfNumbersInTwoStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //      String input1 = "abc123def45gh6"; // Example first string with numbers
		   //     String input2 = "78xyz90";        // Example second string with numbers

		        String input1 = "144"; // Example first string with numbers
		        String input2 = "200";        // Example second string with numbers

		        int sum1 = sumOfNumbersInString(input1);
		        int sum2 = sumOfNumbersInString(input2);

		        int totalSum = sum1 + sum2;

		        System.out.println("The sum of all numbers in the two strings is: " + totalSum);
		    }

		    public static int sumOfNumbersInString(String input) {
		        Pattern pattern = Pattern.compile("\\d+");
		        Matcher matcher = pattern.matcher(input);

		        int sum = 0;
		        while (matcher.find()) {
		            int number = Integer.parseInt(matcher.group());
		            sum += number;
		        }

		        return sum;
		    }	
		    


}
