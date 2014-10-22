package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatBotAppController;

public class ChatbotPanel extends JPanel
{
	/**
	 * declaration section
	 */
	private ChatBotAppController baseController;
	private JButton sampleButton;
	private JTextField sampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
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
		chatArea = new JTextArea(5, 25);
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 246, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 0, SpringLayout.WEST, chatPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -6, SpringLayout.NORTH, sampleButton);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 65, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 100, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 30, SpringLayout.WEST, this);
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
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
		this.add(chatPane);
	}
	
	/**
	 * Computer generated layout goes here.
	 */
	private void setupLayout()
	{
	}
	
	/**
	 * Listeners go here.
	 */
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				sampleField.setText(sampleField.getText() + " :O much wow");
			}
		});
		
	}
	
}
