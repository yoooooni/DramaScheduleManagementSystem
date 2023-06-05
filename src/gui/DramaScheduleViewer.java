package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DramaScheduleViewer extends JFrame {
   
   public DramaScheduleViewer() {
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn("dramaname");
      model.addColumn("dramachannel");
      model.addColumn("runningtime");
      model.addColumn("episodes");
      model.addColumn("Contact Info.");
      
      JTable table = new JTable(model);
      JScrollPane sp = new JScrollPane(table);
      
      this.add(sp);
      this.setSize(300,300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      this.setVisible(true);
   }
}