package drama;

import java.util.Scanner;

public class RomansDramaSchedule extends DramaSchedule implements DramaScheduleInput{
   
    public RomansDramaSchedule(DramaKind kind) {
         super(kind);
         }
   
   public void getUserInput( Scanner input) {
         System.out.print("drama name:");
            String dramaname = input.next();
            this.setDramaname(dramaname);

            System.out.print("drama channel name");
            String dramachannel = input.next();
            this.setDramachannel(dramachannel);

            System.out.print("drama running time(Minutes)");
            int runningtime = input.nextInt();
            this.setRunningtime(runningtime);

            System.out.print("The number of episodes in a drama");
            int episodes = input.nextInt();
            this.setEpisodes(episodes);
      }
      public void printInfo() {
            String skind = "none";
            switch(this.kind) {
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
            System.out.println("kind:" + skind + ", dramaname: " + dramaname + ", channel: " + dramachannel + ", runningtime: " + runningtime + ", episodes: " + episodes);
         }

}