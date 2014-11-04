package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatBotAppController;
import java.awt.Font;

public class ChatbotPanel extends JPanel
{
	/**
	 * declaration section
	 */
	private ChatBotAppController baseController;
	private JButton sampleButton;
	private JButton logoButton;
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
		sampleButton = new JButton("Enter");
		sampleButton.setForeground(Color.WHITE);
		sampleButton.setBackground(Color.BLACK);
		sampleButton.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		sampleField = new JTextField(25);
		sampleField.setForeground(Color.GREEN);
		sampleField.setBackground(Color.BLACK);
		sampleField.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		chatArea = new JTextArea(5, 25);
		chatArea.setBackground(Color.BLACK);
		chatArea.setForeground(Color.ORANGE);
		chatArea.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, 19, SpringLayout.SOUTH, chatPane);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatPane, 0, SpringLayout.EAST, sampleField);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 20, SpringLayout.SOUTH, sampleField);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, 360, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 10, SpringLayout.WEST, this);
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
		this.setBackground(Color.BLACK);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
		this.add(chatPane);
		
		JLabel lblChtBt = new JLabel("Ch@t bot ai v2.0");
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 20, SpringLayout.SOUTH, lblChtBt);
		baseLayout.putConstraint(SpringLayout.NORTH, lblChtBt, 20, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, lblChtBt, 47, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, lblChtBt, -103, SpringLayout.EAST, this);
		lblChtBt.setForeground(Color.CYAN);
		lblChtBt.setFont(new Font("Quartz MS", Font.PLAIN, 32));
		add(lblChtBt);
		
		logoButton = new JButton("SING!");
		logoButton.setForeground(Color.WHITE);
		logoButton.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		logoButton.setBackground(Color.BLACK);
		baseLayout.putConstraint(SpringLayout.NORTH, logoButton, 0, SpringLayout.NORTH, sampleButton);
		baseLayout.putConstraint(SpringLayout.WEST, logoButton, 17, SpringLayout.EAST, sampleButton);
		add(logoButton);
		

		
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
				String userTypedText = sampleField.getText();
				String chatbotResponse = baseController.sendTextToChatBot(userTypedText);
				displayTextToUser(userTypedText);
				displayTextToUser(chatbotResponse);
				sampleField.setText("");
				
			}
		});
		
		logoButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				chatArea.setText(chatArea.getText() + "\n" + "----------------" + "\n" + "This was a triumph." + "\n" + "Im making a note here, HUGE SUCCESS!" + "\n" + "Its hard to over state my satifaction." + "\n" + "Aperture Science." + "\n" + "We do what we must, because we can." + "\n" + "For the good of all of us," + "\n" + "(Except the ones that are dead)." + "\n" + "\n" + "But there's no sense crying over every mistake." + "\n" + "You just keep on trying 'til you run out of cake." + "\n" + "Then the science gets done," + "\n" + "and you make a neat gun," + "\n" + "for the people who are" + "\n" + "STILL ALIVE!" + "\n" + "----------------");
			}
		});
		
	}

	public void displayTextToUser(String input)
	{
		chatArea.append("\n" + input);
	}
}
