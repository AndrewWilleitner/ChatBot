package chatbot.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatBotAppController;

public class ChatbotPanel extends JPanel
{
	/**
	 * declaration section
	 */
	private ChatBotAppController baseController;
	private JButton sampleButton;
	private JTextField sampleField;
	private SpringLayout baseLayout;
	
	/**
	 * This sets all the values to the variables.
	 * @param baseController
	 */
	public ChatbotPanel(ChatBotAppController baseController)
	{
		this.baseController = baseController;
		sampleButton = new JButton("click on me please :D");
		sampleField = new JTextField(25);
		baseLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Sets up the viewing window.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.GREEN);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
	}
	
	/**
	 * Computer generated layout goes here.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, 33, SpringLayout.SOUTH, sampleButton);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 32, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleButton, -110, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 67, SpringLayout.WEST, this);
	}
	
	/**
	 * Listeners go here.
	 */
	private void setupListeners()
	{
		
	}
	
}
