package com.immranderson.renamer;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GUI extends JFrame
	{
		private JTextField previousTextTF;
		private JTextField replacementTextTF;
		private JButton runB;
		
		private final int WIDTH = 700;
		private final int HEIGHT = 300;
		
		private RunButtonHandler runButtonHandler;
		
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
			    
			    runB = new JButton("Run");
			    runButtonHandler = new RunButtonHandler();
			    runB.addActionListener(runButtonHandler);
			    
				Container pane = getContentPane();
				pane.setLayout(new GridLayout(3, 1));
				
				pane.add(previousTextTF);
				pane.add(replacementTextTF);
								
				pane.add(runB);
				
				pane.setSize(WIDTH, HEIGHT);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				
			}
		
		public class RunButtonHandler implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e)
				{
					// TODO Auto-generated method stub
					
				}
			
		}
		
		public static void main(String[] args) {
			new GUI();
		}

	}
