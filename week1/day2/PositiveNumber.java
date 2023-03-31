package week1.day2;

public class PositiveNumber {
	
	public int convertToPositive(int num) {
		 num = -1 * num;
		 return num;
	}

	public static void main(String[] args) {
		
		int i = - 10;
		
		PositiveNumber pn = new PositiveNumber();

		if (i < 0) {
			int result = pn.convertToPositive(i);
			System.out.println("The number " + i + " is converted to " + result);
			
		}else {
			System.out.println("The number " + i + " is already positive");
		}

	}
}

//Initialize an integer with a negative number
//like, int number = -40;
//2. Check if the number is a negative number 
//Hint : any number that is lesser than zero is a negative number
//3. If so, convert the number to a positive numer
//
//4. Print as below
//     "The number -40 is converted to 40"