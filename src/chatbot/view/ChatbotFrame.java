package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatBotAppController;

public class ChatbotFrame extends JFrame
{
	/**
	 * declaration section
	 */
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatBotAppController baseController) 
	{
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
	}
	
	/**
	 * window settings
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
