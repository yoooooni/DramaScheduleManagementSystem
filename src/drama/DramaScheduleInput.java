package drama;

import java.util.Scanner;

public interface DramaScheduleInput {
   
   public String getDramaname();
   
   public void setDramaname(String dramaname);
   
   public void setDramachannel(String dramachannel);
   
   public void setRunningtime(int runingtime);
   
   public void setEpisodes(int episodes);
   
   public void getUserInput( Scanner input);
   
   public void printInfo();

}