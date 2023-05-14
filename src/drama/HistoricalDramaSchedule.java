package drama;

import java.util.Scanner;

public class HistoricalDramaSchedule extends DramaSchedule implements DramaScheduleInput {
   
   public HistoricalDramaSchedule(DramaKind kind) {
      super(kind);
      }

   public void getUserInput( Scanner input) {
      System.out.print("drama name:");
      String dramaname = input.next();
      this.setDramaname(dramaname);

      
      char answer = 'x';
      while(answer != 'y'&& answer != 'Y' && answer != 'N' && answer != 'n') {
         System.out.print("do you know the drama channel? (Y/N)");
         answer = input.next().charAt(0);
         if(answer == 'Y'||answer=='y') {
            System.out.print("drama channel name:");
            String dramachannel = input.next();
            this.setDramachannel(dramachannel);
         }
         else if(answer == 'N'||answer=='n'){
            this.setDramachannel("no information");
         }
         else {
         }
      }
      
      System.out.print("drama running time(Minutes): ");
      int dramarunningtime = input.nextInt();
      this.setRunningtime(dramarunningtime);
      
      
      System.out.print("The number of episodes in a drama: ");
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