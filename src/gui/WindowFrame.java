package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.DramaManager;

public class WindowFrame extends JFrame{
    DramaManager dramaManager;
	MenuSelection menuselection ;
	DramaScheduleAdder dramascheduleadder ;
    DramaScheduleViewer dramascheduleviewer ;

	public WindowFrame(DramaManager dramaManager) {
	    this.setSize(500,300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
	    
		this.dramaManager = dramaManager;
		menuselection = new MenuSelection(this);
	    dramascheduleadder = new DramaScheduleAdder(this);
	    dramascheduleviewer = new DramaScheduleViewer(this, this.dramaManager);
	    
	    this.setupPanel(menuselection);
	    
	    this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
    public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public DramaScheduleAdder getDranascheduleadder() {
		return dramascheduleadder;
	}

	public void setDranascheduleadder(DramaScheduleAdder dranascheduleadder) {
		this.dramascheduleadder = dranascheduleadder;
	}

	public DramaScheduleViewer getDramascheduleviewer() {
		return dramascheduleviewer;
	}

	public void setDramascheduleviewer(DramaScheduleViewer dramascheduleviewer) {
		this.dramascheduleviewer = dramascheduleviewer;
	}


}
