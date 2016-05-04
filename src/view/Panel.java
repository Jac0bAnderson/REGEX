package view;

import controller.Controller;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel extends JPanel
{
private SpringLayout baseLayout;	
private Controller baseController;
private JTextField firstName;
private JTextField lastName;
private JTextField phoneNumber;
private JTextField Email;

public Panel(Controller baseController)
{
this.baseController = baseController;
baseLayout = new SpringLayout();
firstName = new JTextField("",25);
lastName = new JTextField("", 25);
phoneNumber = new JTextField("", 25);
Email = new JTextField("", 25);






setupPanel();
setupLayout();
setupListeners();

}

private void setupPanel()
{
	this.add(Email);
	this.add(phoneNumber);
	this.add(lastName);
	this.add(firstName);
	this.setLayout(baseLayout);
	
}
private void setupLayout()
{
	baseLayout.putConstraint(SpringLayout.NORTH, Email, 22, SpringLayout.SOUTH, phoneNumber);
	baseLayout.putConstraint(SpringLayout.WEST, Email, 0, SpringLayout.WEST, phoneNumber);
	baseLayout.putConstraint(SpringLayout.NORTH, phoneNumber, 25, SpringLayout.SOUTH, lastName);
	baseLayout.putConstraint(SpringLayout.WEST, phoneNumber, 0, SpringLayout.WEST, lastName);
	baseLayout.putConstraint(SpringLayout.NORTH, lastName, 24, SpringLayout.SOUTH, firstName);
	baseLayout.putConstraint(SpringLayout.EAST, lastName, 0, SpringLayout.EAST, firstName);
	baseLayout.putConstraint(SpringLayout.NORTH, firstName, 34, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, firstName, 70, SpringLayout.WEST, this);
}

private void setupListeners()
{
	
}

}