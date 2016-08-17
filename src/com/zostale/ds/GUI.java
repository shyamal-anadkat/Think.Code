package com.zostale.ds;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JCheckBox;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

//subclass of Frame - top level container and inherits 
//all properties from the Frame 
public class GUI extends Frame implements ActionListener, WindowListener {
	private Frame mainFrame;
	private Label ibInput;
	private Label header;
	private TextField what;
	private Button enter;
	private Panel controlPanel;
	private Checkbox yes;
	private Checkbox no;
	private Font font = new Font("Verdana", Font.PLAIN, 30);
	private boolean important;
	private boolean completed;

	Task t1;


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

		header = new Label("Important?");
		header.setFont(font);
		add(header);
		addBooleanCheckbox();

		header = new Label("Completed ?");
		header.setFont(font);
		add(header);
		addBooleanCheckbox();

		//enter button for task 
		enter = new Button("Enter");
		registerEnterEvent();
		enter.setFont(font);
		add(enter);

		//window listener and title and window size params
		addWindowListener(this);
		setTitle("Zostale Task Tracker"); // sets title 
		setSize(857,789); //super Frame init window size 
		setVisible(true); //super Frame

	}

	public void registerEnterEvent() {
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent r){
				System.out.println("Enter Pressed");
				t1 = new Task(important,completed,what.getText());
				SexyQueue<Task> tq = new TaskQueue<Task>();
				tq.enqueue(t1);
				tq.addToMap();
				tq.printTasks();
				addSeperatorToConsole();
			}
		});
	}

	public void addBooleanCheckbox(){
		yes = new Checkbox("Yes");
		no = new Checkbox("No");
		yes.setFont(font);
		no.setFont(font);

		yes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if(state == ItemEvent.SELECTED) {
					System.out.println("Yes checked");
					addSeperatorToConsole();
					important = true;
					completed = true;
				}
				else {
					System.out.println("Yes unchecked");
					addSeperatorToConsole();
				}

			}
		});

		no.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if(state == ItemEvent.SELECTED) {
					System.out.println("No checked");
					addSeperatorToConsole();
					important = false;
					completed = false;
				}
				else {
					System.out.println("No unchecked");
					addSeperatorToConsole();
				}
			}
		});

		add(yes);
		add(no);
	}
	public void addSeperatorToConsole(){
		System.out.println("---------------------|");
	}
}
