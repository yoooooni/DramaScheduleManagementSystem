import java.security.PublicKey;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import drama.DramaKind;
import drama.DramaSchedule;
import drama.DramaScheduleInput;
import drama.HistoricalDramaSchedule;
import drama.MedicalDramaSchedule;
import drama.RomansDramaSchedule;

public class DramaManager {
	ArrayList<DramaScheduleInput> dramaSchedules = new ArrayList<DramaScheduleInput>();
	Scanner input;

	DramaManager(Scanner input) {
		this.input = input;
	}

	public void addDramaSchedule() {
		int kind = 0;
		DramaScheduleInput dramaScheduleInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Romance Drama");
				System.out.println("2 for Historical Drama");
				System.out.println("3 for Medical Drama");
				System.out.print("Select num 1, 2, or 3 for drama kind:");
				kind = input.nextInt();
				if (kind == 1) {
					dramaScheduleInput = new RomansDramaSchedule(DramaKind.RomansDrama);
					dramaScheduleInput.getUserInput(input);
					dramaSchedules.add(dramaScheduleInput);
					break;
				} else if (kind == 2) {
					dramaScheduleInput = new HistoricalDramaSchedule(DramaKind.HistoricalDrama);
					dramaScheduleInput.getUserInput(input);
					dramaSchedules.add(dramaScheduleInput);
					break;
				} else if (kind == 3) {
					dramaScheduleInput = new MedicalDramaSchedule(DramaKind.MedicalDrama);
					dramaScheduleInput.getUserInput(input);
					dramaSchedules.add(dramaScheduleInput);
					break;
				} else {
					System.out.print("Select num for drama kind:");
				}
			} catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;

			}

		}
	}

	public void deletDramaSchedule() {
		System.out.print("drama name:");
		String dramaname = input.next();
		int index = findIndex(dramaname);
		removefromSchedules(index, dramaname);
	}

	public int findIndex(String dramaname) {
		int index = -1;
		for (int i = 0; i < dramaSchedules.size(); i++) {
			if (dramaSchedules.get(i).getDramaname().equals(dramaname)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromSchedules(int index, String dramaname) {
		if (index >= 0) {
			dramaSchedules.remove(index);
			System.out.println("the schedule " + dramaname + " is deleted.");
			return 1;
		}

		else {
			System.out.println("the schedule has not been registered.");
			return -1;
		}
	}

	public void editDramaSchedule() {
		System.out.print("drama name:");
		String dramaname = input.next();
		for (int i = 0; i < dramaSchedules.size(); i++) {
			DramaScheduleInput dramaschedule = dramaSchedules.get(i);
			if (dramaschedule.getDramaname().equals(dramaname)) {
				int num = -1;

				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch (num) {
					case 1:
						dramaschedule.setDramaName(input);
						break;
					case 2:
						dramaschedule.setDramaChannel(input);
						break;
					case 3:
						dramaschedule.setDramaRunningtime(input);
						break;
					case 4:
						dramaschedule.setDramaEpisodes(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewDramaSchedule() {
		System.out.println("#of registered dramas: " + dramaSchedules.size());
		for (int i = 0; i < dramaSchedules.size(); i++) {
			dramaSchedules.get(i).printInfo();
		}
	}

	public void showEditMenu() {
		System.out.println("** Drama Schedule Edit Menu **");
		System.out.println("1. Edit Dramaname");
		System.out.println("2. Edit Dramachannel");
		System.out.println("3. Edit runningtime");
		System.out.println("4. View episodes");
		System.out.println("5. Exit");
		System.out.println("Select one number betwen 1 - 5:");
	}
}