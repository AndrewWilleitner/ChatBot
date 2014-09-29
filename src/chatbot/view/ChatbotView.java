package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatBotAppController;

public class ChatbotView
{

	private ChatBotAppController baseController;
	
	public ChatbotView(ChatBotAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public String displayChatbotConversations(String input)
	{
		String output = "";
		
		output = JOptionPane.showInputDialog(null, baseController.getNotSoCleverBot().getName() + " says hello, " + input + " do you wish to continue?");
		
		return output;
	}
}
