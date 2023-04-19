import java.util.ArrayList;
import java.util.Scanner;

public class DramaManager {//////
   ArrayList<DramaSchedule> dramaSchedules = new ArrayList<DramaSchedule>();
   Scanner input;
   DramaManager(Scanner input) {
      this.input = input;
   }
   
   public void addDramaSchedule() {
      DramaSchedule dramaSchedule = new DramaSchedule();
      System.out.print("drama name:");
      dramaSchedule.dramaname = input.next();
      
      System.out.print("drama channel name");
      dramaSchedule.dramachannel = input.next();
      
      System.out.print("drama running time(Minutes)");
      dramaSchedule.runningtime = input.nextInt();
      
      System.out.print("The number of episodes in a drama");
      dramaSchedule.episodes = input.nextInt();
      dramaSchedules.add(dramaSchedule);
   }
   
   public void deletDramaSchedule() {
      System.out.print("drama name:");
      String dramaname = input.next();
      int index = -1;
      for(int i=0; i<dramaSchedules.size();i++) {
         if(dramaSchedules.get(i).dramaname.equals(dramaname)) {
            index = i;
            break;
         }
      }
      
      if(index>=0) {
         dramaSchedules.remove(index);
         System.out.println("the schedule " + dramaname + " is deleted.");        
      }
      
      else {
         System.out.println("the schedule has not been registered.");
          return;
      }
   }
   
   
   public void editDramaSchedule() {
      System.out.print("drama name:");
      String dramaname = input.next();
      for(int i=0; i<dramaSchedules.size();i++) {
         DramaSchedule dramaschedule = dramaSchedules.get(i);
         if(dramaschedule.dramaname.equals(dramaname)) {
            int num = -1;

            while(num != 5) {
               System.out.println("** Drama Schedule Edit Menu **");
               System.out.println("1. Edit Dramaname");
               System.out.println("2. Edit Dramachannel");
               System.out.println("3. Edit runningtime");
               System.out.println("4. View episodes");
               System.out.println("5. Exit");
               System.out.println("Select one number betwen 1 - 5:");
               num = input.nextInt();

               if (num == 1) {
                  System.out.print("dramaname: ");
                  dramaschedule.dramaname = input.next();
               }

               else if (num == 2) {
                  System.out.print("dramachannel: ");
                  dramaschedule.dramachannel = input.next();
               }

               else if (num == 3) {
                  System.out.print("runningtime: ");
                  dramaschedule.runningtime = input.nextInt();
               }

               else if (num == 4) {
                  System.out.print("episodes: ");
                  dramaschedule.episodes = input.nextInt();
               }

               else {
                  continue;
               }
            }
            break;
         }
      }
   }

         
   
   public void viewDramaSchedule() {
//      System.out.print("drama name:");
//     String dramaname = input.next();
     for(int i=0; i<dramaSchedules.size();i++) {
        dramaSchedules.get(i).printInfo();
     }
   }
}