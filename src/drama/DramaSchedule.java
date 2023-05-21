package drama;

import java.util.Scanner;

import exception.ChannelFormatException;

public abstract class DramaSchedule implements DramaScheduleInput {

	protected DramaKind kind = DramaKind.RomansDrama;
	protected String dramaname;
	protected String dramachannel;
	protected int runningtime;
	protected int episodes;

	public DramaSchedule() {
	}

	public DramaSchedule(DramaKind kind) {
		this.kind = kind;
	}

	public DramaSchedule(String dramaname, String dramachannel) {
		this.dramaname = dramaname;
		this.dramachannel = dramachannel;
	}

	public DramaSchedule(String dramaname, String dramachannel, int runningtime, int episodes) {
		this.dramaname = dramaname;
		this.dramachannel = dramachannel;
		this.runningtime = runningtime;
		this.episodes = episodes;
	}

	public DramaSchedule(DramaKind kind, String dramaname, String dramachannel, int runningtime, int episodes) {
		this.kind = kind;
		this.dramaname = dramaname;
		this.dramachannel = dramachannel;
		this.runningtime = runningtime;
		this.episodes = episodes;
	}

	public DramaKind getKind() {
		return kind;
	}

	public void setKind(DramaKind kind) {
		this.kind = kind;
	}

	public String getDramaname() {
		return dramaname;
	}

	public void setDramaname(String dramaname) {
		this.dramaname = dramaname;
	}

	public String getDramachannel() {
		return dramachannel;
	}

	public void setDramachannel(String dramachannel) throws ChannelFormatException {
		if (!dramachannel.contains("S") || !dramachannel.equals("")) {
			throw new ChannelFormatException();
		}
		
		this.dramachannel = dramachannel;
	}

	public int getRunningtime() {
		return runningtime;
	}

	public void setRunningtime(int runingtime) {
		this.runningtime = runingtime;
	}

	public int getEpisodes() {
		return episodes;
	}

	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}

	public abstract void printInfo();

	public void setDramaName(Scanner input) {
		System.out.print("dramaname: ");
		String dramaname1 = input.next();
		this.setDramaname(dramaname1);
	}

	public void setDramaChannel(Scanner input) {
		String dramachannel = "";
		while(dramachannel.contains("S"))
		
		System.out.print("dramachannel: ");
		dramachannel = input.next();
		try {
			this.setDramachannel(dramachannel);
		} catch (ChannelFormatException e) {
			System.out.println("Incorrect broadcaster Format. put the channel that contains S.");
			e.printStackTrace();
		}
	}

	public void setDramaRunningtime(Scanner input) {
		System.out.print("runningtime: ");
		int runningtime = input.nextInt();
		this.setRunningtime(runningtime);
	}

	public void setDramaEpisodes(Scanner input) {
		System.out.print("episodes: ");
		int episodes = input.nextInt();
		this.setEpisodes(episodes);
	}

	public String getKindString() {
		String skind = "none";
		switch (this.kind) {
		case RomansDrama:
			skind = "Romans";
			break;
		case HistoricalDrama:
			skind = "Historical";
			break;
		case FantasyDrama:
			skind = "Fantasy";
			break;
		case ThrillerDrama:
			skind = "Thriller";
			break;
		case ActionDrama:
			skind = "Action";
			break;
		case CrimeDrama:
			skind = "Crime";
			break;
		case MedicalDrama:
			skind = "Medical";
			break;
		default:
		}
		return skind;
	}

}