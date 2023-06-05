package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
   
   public MenuSelection() {
      this.setSize(400,400);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      JLabel label = new JLabel("Menu Selection");
      
      JButton button1 = new JButton("1. Add Drama schedule");
      JButton button2 = new JButton("2. Delet Drama schedule");
      JButton button3 = new JButton("3. Edit Drama schedule");
      JButton button4 = new JButton("4. View Drama schedules");
      JButton button5 = new JButton("5. Exit program");
      
      panel1.add(label);
      panel2.add(button1);
      panel2.add(button2);
      panel2.add(button3);
      panel2.add(button4);
      panel2.add(button5);
      
      this.add(panel1, BorderLayout.NORTH);
      this.add(panel2, BorderLayout.CENTER);
      
      this.setVisible(true);
      
   }

}