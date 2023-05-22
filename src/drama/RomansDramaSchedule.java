package drama;

import java.util.Scanner;

public class RomansDramaSchedule extends AllDrama {

	public RomansDramaSchedule(DramaKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setDramaName(input);
		setDramaChannelwithYN(input);
		setDramaRunningtime(input);
		setDramaEpisodes(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + ", dramaname: " + dramaname + ", channel: " + dramachannel
				+ ", runningtime: " + runningtime + ", episodes: " + episodes);
	}

}