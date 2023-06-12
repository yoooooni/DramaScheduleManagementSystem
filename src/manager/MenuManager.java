package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
   static EventLogger logger = new EventLogger("log.txt");
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      DramaManager dramaManager = getObject("dramaManager.ser");
      if(dramaManager == null) {
         dramaManager = new DramaManager(input);      
      }
      
      WindowFrame frame = new WindowFrame(dramaManager);
            
      selectMenu(input, dramaManager);
      putObject(dramaManager, "dramaManager.ser");
   }

   public static void selectMenu(Scanner input, DramaManager dramaManager) {
      int num = -1;
      while (num != 5) {
         try {
            showMenu();
            num = input.nextInt();
            switch (num) {
            case 1:
               dramaManager.addDramaSchedule();
               logger.log("add dramascheedule");
               break;
            case 2:
               dramaManager.deletDramaSchedule();
               logger.log("delet dramascheedule");
               break;
            case 3:
               dramaManager.editDramaSchedule();
               logger.log("edit dramascheedule");
               break;
            case 4:
               dramaManager.viewDramaSchedule();
               logger.log("view dramascheedule");
               break;
            default:
               continue;
            }
         } 

         catch (InputMismatchException e) {
            System.out.println("Please put an integer between 1 and 5!");
            if (input.hasNext()) {
               input.next();
            }
            num = -1;
         }
      }
   }

   public static void showMenu() {
      System.out.println("**** Drama Schedule Management System Menu ****");
      System.out.println("1. Add Drama schedule");
      System.out.println("2. Delet Drama schedule");
      System.out.println("3. Edit Drama schedule");
      System.out.println("4. View Drama schedules");
      System.out.println("5. Exit");
      System.out.println("Select one number betwen 1 - 5:");
   }
   
   public static DramaManager getObject(String filename) {
      DramaManager dramaManager = null;
      
      
      try {
         FileInputStream file = new FileInputStream(filename);
         ObjectInputStream in = new ObjectInputStream(file);
         
         dramaManager = (DramaManager)in.readObject();
         
         in.close();
         file.close();
         
         
      } catch (FileNotFoundException e) {
         return dramaManager;
      } catch (IOException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
      
      return dramaManager;
      
   }
   
   public static void putObject(DramaManager dramaManager, String filename) {
      try {
         FileOutputStream file = new FileOutputStream(filename);
         ObjectOutputStream out = new ObjectOutputStream(file);
         
         out.writeObject(dramaManager);
         
         out.close();
         file.close();
         
         
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();         
      }
   }
}