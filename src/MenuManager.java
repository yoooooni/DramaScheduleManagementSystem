import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DramaManager dramaManager = new DramaManager(input);

		selectMenu(input, dramaManager);

	}

	public static void selectMenu(Scanner input, DramaManager dramaManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch (num) {
				case 1:
					dramaManager.addDramaSchedule();
					break;
				case 2:
					dramaManager.deletDramaSchedule();
					break;
				case 3:
					dramaManager.editDramaSchedule();
					break;
				case 4:
					dramaManager.viewDramaSchedule();
					break;
				default:
					continue;
				}
			} 
			catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("**** Drama Schedule Management System Menu ****");
		System.out.println("1. Add Drama schedule");
		System.out.println("2. Delet Drama schedule");
		System.out.println("3. Edit Drama schedule");
		System.out.println("4. View Drama schedules");
		System.out.println("5. Exit");
		System.out.println("Select one number betwen 1 - 5:");

	}
}