package drama;

import java.util.Scanner;

public class HistoricalDramaSchedule extends AllDrama {

	public HistoricalDramaSchedule(DramaKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setDramaName(input);
		setDramaChannelwithYN(input);
		setDramaRunningtime(input);
		setDramaEpisodes(input);
	}
}