package drama;

import java.util.Scanner;

import exception.ChannelFormatException;

public interface DramaScheduleInput {

	public String getDramaname();

	public void setDramaname(String dramaname);

	public void setDramachannel(String dramachannel) throws ChannelFormatException;

	public void setRunningtime(int runingtime);

	public void setEpisodes(int episodes);

	public void getUserInput(Scanner input);

	public void printInfo();

	public void setDramaName(Scanner input);

	public void setDramaChannel(Scanner input);

	public void setDramaRunningtime(Scanner input);

	public void setDramaEpisodes(Scanner input);

}