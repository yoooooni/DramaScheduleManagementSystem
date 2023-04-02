import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
			System.out.println("**** Drama Schedule Management System Menu ****");
			System.out.println("1. Add Drama schedule");
			System.out.println("2. Delet Drama schedule");
			System.out.println("3. Edit Drama schedule");
			System.out.println("4. View Drama schedule");
			System.out.println("5. show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number betwen 1 - 6:");
			num = input.nextInt();
			if (num == 1) {
				addDramaSchedule();
			}
			else if (num == 2) {
				deletDramaSchedule();
			}
			else if (num == 3) {
				editDramaSchedule();
			}
			else if (num == 4) {
				viewDramaSchedule();
			}	
			else {
				continue;
			}
		}
	}	
	
	
	public static void addDramaSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.print("drama name:");
		String dramaname = input.next();
		System.out.print("drama channel name");
		String dramachannel = input.next();
		System.out.print("drama running time(Minutes)");
		int runningtime = input.nextInt();
		System.out.print("The number of episodes in a drama");
		int episodes = input.nextInt();
		
	}
	
	public static void deletDramaSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.print("drama name:");
		String dramaname = input.next();
		System.out.print("drama channel name");
		String dramachannel = input.next();
		System.out.print("drama running time(Minutes)");
		int runningtime = input.nextInt();
		System.out.print("The number of episodes in a drama");
		int episodes = input.nextInt();
	}
	
	
	public static void editDramaSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.print("drama name:");
		String dramaname = input.next();
		System.out.print("drama channel name");
		String dramachannel = input.next();
		System.out.print("drama running time(Minutes)");
		int runningtime = input.nextInt();
		System.out.print("The number of episodes in a drama");
		int episodes = input.nextInt();
	}
	
	public static void viewDramaSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.print("drama name:");
		String dramaname = input.next();
		System.out.print("drama channel name");
		String dramachannel = input.next();
		System.out.print("drama running time(Minutes)");
		int runningtime = input.nextInt();	
		System.out.print("The number of episodes in a drama");
		int episodes = input.nextInt();
	}		
}