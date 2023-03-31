package week1.day2;

//Create a method as tabPrice with input argument as int tabPrice and add return type
//Create a method tabBrand(String brandName)with return type as string
//Create object for the tab class and call the methods and print in console to verify it

public class Tab {
	public int tabPrice(int tabPrice) {
		return tabPrice;
	}

	public String tabBrand(String BrandName) {
			return BrandName;

	}	



	public static void main(String[] args) {
		Tab obj = new Tab();
		obj.tabPrice(10);
		obj.tabBrand("brand");
		
	}
		
}
