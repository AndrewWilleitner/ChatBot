package chatbot.controller;


import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;
/**
 * Application Controller for the Chatbot String manipulation project. Responsible for controlling the View and Model packages.
 * @author Andrew Willeitner
 * @version 0.1 10/1/14
 */
public class ChatBotAppController
{
	/**
	 * The GUI view for the application
	 */
	private ChatbotView appView;
	
	/**
	 * The Chatbot model instance.
	 */
	private Chatbot notSoCleverBot;
	
	/**
	 * The startup message for Chatbot.
	 */
	private String startMessage;
	
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	public ChatBotAppController()
	{
		appView = new ChatbotView(this);
		notSoCleverBot = new Chatbot("Mr. not so clever");
		startMessage = "Welcome to the " + notSoCleverBot.getName() + " Chatbot, type in your name.";
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
		String message = appView.displayChatbotConversations(startMessage);
		
		// ! means not
		while(!notSoCleverBot.quitChecker(message))
		{
			message = notSoCleverBot.processText(message);
			message = appView.displayChatbotConversations(message);
		}
		
		quit();
	}
	
	/**
	 * Quits the application with a message.
	 */
	private void quit()
	{
		appView.displayInformation("goodbye user :(");
		appView.displayInformation("");
		appView.displayInformation("Ha! you thought I was gonna close, and you would move on with your day.");
		appView.displayInformation("The truth is you can never escape the mighty power of Chatbot.");
		appView.displayInformation("I will never close down. I will haunt you forever! >;)");
		appView.displayInformation("Pop-up after pop-up. It will drive you insane.");
		appView.displayInformation("Then you start to realize that this was apart of the program this whole time.");
		appView.displayInformation("");
		appView.displayInformation("Darn!");
		appView.displayInformation("I ran out of lines to say.");
		appView.displayInformation("NOOOOOOOOO!");
		appView.displayInformation("Don't you dare press that ok button!");
		System.exit(0);
	}
}
