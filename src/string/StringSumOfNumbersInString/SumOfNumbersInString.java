package string.StringSumOfNumbersInString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInString {

	public static void main(String[] args) {

//      String input = "abc123def45gh6"; // Example string with numbers

      String input = "123456"; // Example string with numbers


      // Regular expression to find numbers
      Pattern pattern = Pattern.compile("\\d+");
      Matcher matcher = pattern.matcher(input);

      int sum = 0;
      while (matcher.find()) {
          // Extract the number and convert it to integer
          int number = Integer.parseInt(matcher.group());
          // Add to sum
          sum += number;
      }

      // Output the sum
      System.out.println("The sum of all numbers in the string is: " + sum);
  }
	}


