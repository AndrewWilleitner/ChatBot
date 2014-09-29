package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

public class ChatBotAppController
{
	private ChatbotView appView;
	private Chatbot notSoCleverBot;
	
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	
	public ChatBotAppController()
	{
		appView = new ChatbotView(this);
		notSoCleverBot = new Chatbot("Mr. not so clever");
	}
	
	
	/**
	 * Allows other objects access to the notSoCleverbot.
	 * @return The Chatbot for this app.
	 */
	public Chatbot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}
	
	/**
	 * Start the Chatbot Application.
	 */
	
	public void start()
	{
		String message = JOptionPane.showInputDialog(null, "Welcome to Chatbot, type in your name.");
		
		// ! means not
		while(!notSoCleverBot.quitChecker(message))
		{
			message = appView.displayChatbotConversations(message);
		}

	}
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "bye");
		System.exit(0);
	}
}
