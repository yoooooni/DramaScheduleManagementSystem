package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import drama.DramaScheduleInput;
import manager.DramaManager;

public class DramaScheduleViewer extends JPanel {
	
	WindowFrame frame;
	
    DramaManager dramaManager;
   
   public DramaScheduleViewer(WindowFrame frame, DramaManager dramaManager) {
	   this.frame = frame;
	   this.dramaManager = dramaManager;
	   
	  System.out.println("***" + dramaManager.size() + "***");
	   
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn("dramaname");
      model.addColumn("dramachannel");
      model.addColumn("runningtime");
      model.addColumn("episodes");
      model.addColumn("Contact Info.");
      
      for (int i = 0; i<dramaManager.size(); i++) {
    	  Vector row = new Vector();
    	  DramaScheduleInput di = dramaManager.get(i);
    	  row.add(di.getDramaname());
    	  row.add(di.getDramachannel());
    	  row.add(di.getRunningtime());
    	  row.add(di.getEpisodes());
    	  
      }
      
      JTable table = new JTable(model);
      JScrollPane sp = new JScrollPane(table);
      
      this.add(sp);
   }
}