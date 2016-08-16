package com.zostale.ds;

import java.awt.*;
import java.awt.event.*;

//subclass of Frame - top level container and inherits 
//all properties from the Frame 
public class GUI extends Frame implements ActionListener, WindowListener {
	private Frame mainFrame;
	private Label ibInput;
	private TextField what;
	private Button enter;
	private Panel controlPanel;


	//initializes components
	public GUI() {
		initGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action Performed");
		addSeperatorToConsole();
	}

	public static void main(String[] args) {
		GUI app = new GUI();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("GUI Started");
		addSeperatorToConsole();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Exiting GUI. GoodBye");
		addSeperatorToConsole();
		System.exit(0);  // Terminate the program
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window Deactivated");
		addSeperatorToConsole();
	}

	public void initGUI() {
		setLayout(new FlowLayout());


		//task description input 
		Font font = new Font("Verdana", Font.PLAIN, 30);
		ibInput = new Label("Enter task description: ");
		ibInput.setAlignment(Label.CENTER);
		ibInput.setFont(font);
		add(ibInput);
		//text field for task description
		what = new TextField("",25);
		what.setFont(font);
		add(what);
		//enter button for task 
		enter = new Button("Enter");
		registerEnterEvent();
		enter.setFont(font);
		add(enter);

		//window listener and title and window size params
		addWindowListener(this);
		setTitle("Zostale Task Tracker"); // sets title 
		setSize(1000,1000); //super Frame init window size 
		setVisible(true); //super Frame

	}

	public void registerEnterEvent() {
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent r){
				System.out.println("Enter Pressed");
				addSeperatorToConsole();
			}
		});
	}
	public void addSeperatorToConsole(){
		System.out.println("---------------------|");
	}
}
