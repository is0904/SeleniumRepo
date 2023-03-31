package week1.day2;

public class Fibo {
	public void add(int num) {
		int num1 = 0;
		int num2 = 1;
		int sum = num1 + num2;
		System.out.println(sum);
		for (int i  = 1; i<=num; i++) {
			num2 = num1;
			sum = num2;
			System.out.println(sum);
		}
		
	}
	

	public static void main(String[] args) {
		Fibo obj = new Fibo();
		obj.add(10);
		}
		
		
	}



//Create a method as tabPrice with input argument as int tabPrice and add return type
//Create a method tabBrand(String brandName)with return type as string
//Create object for the tab class and call the methods and print in console to verify it