public class DramaSchedule {
   String dramaname;
   String dramachannel;
   int runningtime;
   int episodes;
      
   public DramaSchedule() {
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
   
   public void printInfo() {
      System.out.println("dramaname: " + dramaname + ", " + "channel: " + dramachannel + ", " + "runningtime: " + runningtime + ", " + "episodes: " + episodes);
   }

}