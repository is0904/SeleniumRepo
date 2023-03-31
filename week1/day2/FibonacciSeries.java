package week1.day2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
			int range = 8;
					
			int num1 = 0;
			
			int num2 = 1;
			
			int sum  = 0;
		// Print first number
		
			
			System.out.println(num1);
			System.out.println(num2);
		// Iterate from 1 to the range
			for (int x = 1; x<=range; x++) {
				
				sum  = num1 + num2;
				System.out.println(sum);
		
				num1 = num2;
				
				 num2 = sum;
				
				
			}
		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign sum to the second number
		
		// print sum

	}

}