package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class DramaScheduleAdder extends JFrame{
   
   public DramaScheduleAdder() {
      JPanel panel = new JPanel();
      panel.setLayout(new SpringLayout());
      
      //dramaname
      JLabel label_dramaname = new JLabel("dramaname: ",JLabel.TRAILING);
      JTextField field_dramaname = new JTextField(10);
      label_dramaname.setLabelFor(field_dramaname);
      panel.add(label_dramaname);
      panel.add(field_dramaname);
      
      //dramachannel
      JLabel label_dramachannel = new JLabel("dramachannel: ",JLabel.TRAILING);
      JTextField field_dramachannel = new JTextField(10);
      label_dramaname.setLabelFor(field_dramachannel);
      panel.add(label_dramachannel);
      panel.add(field_dramachannel);
      
      //runningtime
      JLabel label_runningtime = new JLabel("runningtime: ",JLabel.TRAILING);
      JTextField field_runningtime = new JTextField(10);
      label_dramaname.setLabelFor(field_runningtime);
      panel.add(label_runningtime);
      panel.add(field_runningtime);
      
      //episodes
      JLabel label_episodes = new JLabel("episodes: ",JLabel.TRAILING);
      JTextField field_episodes = new JTextField(10);
      label_dramaname.setLabelFor(field_episodes);
      panel.add(label_episodes);
      panel.add(field_episodes);
      
      panel.add(new JButton("save"));
      panel.add(new JButton("cancel"));
      
      
      SpringUtilities.makeCompactGrid(panel,5,2,6,6,6,6);
      
      this.setSize(300,300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      this.setContentPane(panel);
      this.setVisible(true);
   }
}