package view;

import javax.swing.JFrame;
import controller.Controller;

public class Frame extends JFrame
{
private Panel basePanel;
private Controller baseController;

public Frame(Controller baseController)
{
	this.baseController = baseController;
	basePanel = new Panel(baseController);
	setupFrame();
}
private void setupFrame()
{
	this.setContentPane(basePanel);
	this.setSize(500, 500);
	this.setResizable(true);
	this.setTitle("Regex");
	this.setVisible(true);
}
	
	
}