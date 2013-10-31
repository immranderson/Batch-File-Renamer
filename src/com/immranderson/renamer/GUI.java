package com.immranderson.renamer;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GUI extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField previousTextTF;
	private JTextField replacementTextTF;
	private JTextField directoryTF;
	
	private JLabel previousTextLabel;
	private JLabel replacementTextLabel;
	
	private JButton runB;
	private JButton directoryB;

	private final int WIDTH = 800;
	private final int HEIGHT = 400;

	private RunButtonHandler runButtonHandler;
	private DirectoryButtonHandler directoryButtonHandler;
	
	private DirectoryOpener directoryOpener;

	public GUI()
		{
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //make it look pretty
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (InstantiationException e) {

				e.printStackTrace();
			} catch (IllegalAccessException e) {

				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {

				e.printStackTrace();
			}

			
			previousTextTF = new JTextField();
			replacementTextTF = new JTextField();
			directoryTF = new JTextField();
			
			previousTextLabel = new JLabel("Previous Text");
			replacementTextLabel = new JLabel("Replacement Text");
			
			

			runB = new JButton("Run");
			runButtonHandler = new RunButtonHandler();
			runB.addActionListener(runButtonHandler);
			
			directoryB = new JButton("Choose Directory");
			directoryButtonHandler = new DirectoryButtonHandler();
			directoryB.addActionListener(directoryButtonHandler);

			Container pane = getContentPane();
			pane.setLayout(new GridLayout(4, 2));

			//Pane is populated in order from top left to bottom right
			pane.add(directoryB);
			pane.add(directoryTF);
			
			pane.add(previousTextLabel);
			pane.add(previousTextTF);
			
			pane.add(replacementTextLabel);
			pane.add(replacementTextTF);

			pane.add(runB);
			setSize(WIDTH, HEIGHT);

			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

		}

	public class RunButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				System.out.println("Run Button Pressed");
				
			}

	}
	
	public class DirectoryButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				System.out.println("Directory Button Pressed");
				directoryOpener = new DirectoryOpener();
				
				System.out.println(directoryOpener.getName());
			}
		
	}

	public static void main(String[] args) {
		new GUI();
	}

}
