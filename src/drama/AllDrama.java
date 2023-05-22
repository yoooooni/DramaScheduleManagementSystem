package drama;

import java.util.Scanner;

import exception.ChannelFormatException;

public abstract class AllDrama extends DramaSchedule {

	public AllDrama(DramaKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + ", dramaname: " + dramaname + ", channel: " + dramachannel
				+ ", runningtime: " + runningtime + ", episodes: " + episodes);
	}

	public void setDramaChannelwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'N' && answer != 'n') {
			System.out.print("do you know the drama channel? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'Y' || answer == 'y') {
					System.out.print("drama channel name:");
					String dramachannel = input.next();
					this.setDramachannel(dramachannel);
					break;
				} else if (answer == 'N' || answer == 'n') {
					this.setDramachannel("no information");
					break;
				} 
				else {
				}
			} 
			catch (ChannelFormatException e) {
				System.out.println("Incorrect broadcaster Format. put the channel that contains terrestrial broadcasting channel.");
			}
		}
	}

}
