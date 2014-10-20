package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatBotAppController;

public class ChatbotFrame extends JFrame
{
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatBotAppController baseController) 
	{
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
}
