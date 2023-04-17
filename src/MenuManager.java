import java.util.Scanner;

public class MenuManager {

   public static void main(String[] args) {      
      Scanner input = new Scanner(System.in); 
      DramaManager dramaManager = new DramaManager(input);
      
      int num = -1;
      
      
      while(num != 5) {
         System.out.println("**** Drama Schedule Management System Menu ****");
         System.out.println("1. Add Drama schedule");
         System.out.println("2. Delet Drama schedule");
         System.out.println("3. Edit Drama schedule");
         System.out.println("4. View Drama schedules");
         System.out.println("5. Exit");
         System.out.println("Select one number betwen 1 - 5:");
         num = input.nextInt();
         
         if (num == 1) {
            dramaManager.addDramaSchedule();
         }
         
         else if (num == 2) {
            dramaManager.deletDramaSchedule();
         }
         
         else if (num == 3) {
            dramaManager.editDramaSchedule();
         }
         
         else if (num == 4) {
            dramaManager.viewDramaSchedule();
         }
         
         else {
            continue;
         }
      }
   }   
}