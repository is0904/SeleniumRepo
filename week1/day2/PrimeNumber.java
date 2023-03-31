package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 12;

		int halfofInput = input / 2;

		boolean flag = false;

		for (int x = 2; x <= halfofInput; ++x) {

			if (input % x == 0) {

				flag = true;

				break;

			}
		}

		if (flag == true) {

			System.out.println("This is not a prime number");
		} else {
			System.out.println("This is a prime number");
		}

	}

}
