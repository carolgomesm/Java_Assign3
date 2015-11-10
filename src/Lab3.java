import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lab3 extends JFrame{
	JButton calculateButton;
	JComboBox numOfCoursesCombo;
	JLabel creditsLbl, currentGPALbl, 
			numOfCoursesLbl, 
			nr, courseCode, creditHours, grade,
			finalGPA;
	JPanel topPanel, topUpperPanel, topLowerPanel, coursePanel, bottomPanel;
	JTextField creditsTextField, currentGPATF;

	public Lab3()
	{
		setLayout( new BorderLayout());
		
		coursePanel = new JPanel();
		
		//Creates top panel
		topPanel = new JPanel();
		topUpperPanel = new JPanel();
		creditsLbl = new JLabel("Number of credits ");
		currentGPALbl = new JLabel("Current GPA "); 
		numOfCoursesLbl = new JLabel("Number of courses: ");
		creditsTextField = new JTextField(4);
		currentGPATF = new JTextField(4);
		
		topUpperPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		topUpperPanel.add(creditsLbl);
		topUpperPanel.add(creditsTextField);
		topUpperPanel.add(currentGPALbl);
		topUpperPanel.add(currentGPATF);
		
		topPanel.setLayout(new BorderLayout());
		topPanel.add(topUpperPanel, BorderLayout.NORTH);
		add(topPanel, BorderLayout.NORTH);
		
		numOfCoursesLbl = new JLabel("Number of courses ");
		String[] courses = {"1", "2"};
		
		numOfCoursesCombo = new JComboBox <String>(courses);
		
		topLowerPanel = new JPanel();
		topLowerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		topLowerPanel.add(numOfCoursesLbl);
		topLowerPanel.add(numOfCoursesCombo);
		topPanel.add(topLowerPanel, BorderLayout.SOUTH);
		
		
		//Creates the bottom of the layout
		bottomPanel = new JPanel();
		finalGPA = new JLabel("Your final GPA is ");
		calculateButton = new JButton ("Calculate");
		bottomPanel.add(finalGPA);
		bottomPanel.add(calculateButton);
		add("South", bottomPanel);
	}

	public static void main(String[] args) {
		Lab3 frame = new Lab3();
		frame.setTitle("GPA Calculator");
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
