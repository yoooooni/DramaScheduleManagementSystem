package drama;

import java.util.Scanner;

public abstract class DramaSchedule {

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

   public void setDramachannel(String dramachannel) {
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

}