package drama;

import java.util.Scanner;

import exception.ChannelFormatException;

public class MedicalDramaSchedule extends AllDrama {

	protected int prevRunningtime;
	protected int prevEpisodes;

	public MedicalDramaSchedule(DramaKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setDramaName(input);
		setDramaChannelwithYN(input);
		setRerunDramaChannelwithYN(input);
		setDramaRunningtime(input);
		setDramaEpisodes(input);
	}

	public void setRerunDramaChannelwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'N' && answer != 'n') {
			System.out.print("do you know the rerun drama channel? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'Y' || answer == 'y') {
					setDramaChannel(input);
				} else if (answer == 'N' || answer == 'n') {
					this.setDramachannel("no information");
				} 
				else {
				}
			}
			catch (ChannelFormatException e) {
				System.out.println("Incorrect broadcaster Format. put the channel that contains S.");
			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + ", dramaname: " + dramaname + ", channel: " + dramachannel
				+ ", runningtime: " + runningtime + ", episodes: " + episodes + ", prev runningtime: " + runningtime
				+ ", prev episodes: " + episodes);
	}

}