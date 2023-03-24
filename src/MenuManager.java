import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;	
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
		System.out.println("1. Add Foods");
		System.out.println("2. Delete Foods");
		System.out.println("3. Edit Foods");
		System.out.println("4. View Foods");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1~6:");
		num = input.nextInt();
		switch(num) {
		case 1 :
			System.out.print("Food Name:");
			String foodName = input.next();
			System.out.print("Food Price:");
			int foodPrice = input.nextInt();
			System.out.print("Number of Food:");
			int numberFood = input.nextInt();
			System.out.print("Expiration date:");
			int date = input.nextInt();
			break;
		case 2 :
			System.out.print("Food Name:");
			String deleteFoodName = input.next();
			break;
		case 3 :
			System.out.print("Food Name:");
			String EditFoodName = input.next();
			break;
		case 4 : 
			System.out.print("Food Name:");
		    String ViewFoodName = input.next();
			break;
		}
		
	}
	}
}