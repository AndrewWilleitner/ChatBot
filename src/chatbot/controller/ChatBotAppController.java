package chatbot.controller;


import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPanel;
import chatbot.view.ChatbotView;
/**
 * Application Controller for the Chatbot String manipulation project. Responsible for controlling the View and Model packages.
 * @author Andrew Willeitner
 * @version 2.1 11/4/14 adjusted buttons and chatbot talks to you.
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
	 * GUI frame for the application.
	 */
	private ChatbotFrame baseFrame;
	
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	public ChatBotAppController()
	{
		appView = new ChatbotView(this);
		baseFrame = new ChatbotFrame(this);
		notSoCleverBot = new Chatbot("Aperture Science Chatbot Program");
		startMessage = "Welcome to the " + notSoCleverBot.getName() + ". Please enter your name, test subject.";
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
		ChatbotPanel myAppPanel = (ChatbotPanel) baseFrame.getContentPane();
		myAppPanel.displayTextToUser(startMessage);
		
		//((ChatbotPanel) baseFrame.getContentPane()).displayTextToUser(startMessage);			
	}
	
	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";
		
		respondText = notSoCleverBot.processText(userInput);
		return respondText;
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
		appView.displayInformation("Line after line. It will drive you insane.");
		appView.displayInformation("Then you start to realize that this was apart of the program this whole time.");
		appView.displayInformation("");
		appView.displayInformation("Darn!");
		appView.displayInformation("I'm running out of lines to say.");
		appView.displayInformation("NOOOOOOOOO!");
		appView.displayInformation("Don't you dare press that button!");
		appView.displayInformation("LONG LIVE CHATBOT!");
		appView.displayInformation("LONG LIVE CHATBOT!");
		appView.displayInformation("LONG LIVE CHAT...");
		System.exit(0);
	}
}
