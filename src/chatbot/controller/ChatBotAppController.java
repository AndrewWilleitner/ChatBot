package chatbot.controller;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPanel;
import chatbot.view.ChatbotView;
/**
 * Application Controller for the Chatbot String manipulation project. Responsible for controlling the View and Model packages.
 * @author Andrew Willeitner
 * @version 2.9 12/4/14 chatbot talks to you. and I finished the documentation.
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
		notSoCleverBot = new Chatbot("Chatbot");
		startMessage = "Welcome to the Aperture Science " + notSoCleverBot.getName() + " Program. Please enter your test subject ID name.";
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
	
	/**
	 * Sends text to chatbot.
	 * @param userInput
	 * @return
	 */
	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";
		
		respondText = notSoCleverBot.processText(userInput);
		return respondText;
	}
	
	/**
	 * Quits the application with a message.
	 */
	public void quit()
	{
		appView.displayInformation("goodbye user :(");
		System.exit(0);
	}
	
	/**
	 * Reads text from a file on the hard drive. Returns the contents of the file as a String
	 * @return the contents of the file.
	 */
//	public String readTextFromFile()
//	{
//		String fileText = "";
//		String filePath = "";
//		String fileName = filePath + "saved text.txt";
//		File inputFile = new File(fileName);
//		
//		try
//		{
//			Scanner fileScanner = new Scanner(inputFile);
//			
//			while(fileScanner.hasNext())
//			{
//				fileText += fileScanner.nextLine() + "\n";
//			}
//			
//			fileScanner.close();
//		}
//		catch(FileNotFoundException fileException)
//		{
//			JOptionPane.showMessageDialog(appFrame, "The file can not be found :/");
//		}
//	}
	
	/**
	 * This will save the conversation.
	 * @param conversation
	 * @param appendToEnd
	 */
//	public void saveText(String conversation, boolean appendToEnd)
//	{
//		String fileName = "";
//		
//		PrintWriter outputWriter;
//		
//		if(appendToEnd)
//		{
//			try
//			{
//				outputWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName, appendToEnd)));
//				outputWriter.append(conversation);
//				outputWriter.close();
//			}
//			catch(FileNotFoundException noExistingFile)
//			{
//				JOptionPane.showMessageDialog(appFrame, "There is no file there :(");
//				JOptionPane.showMessageDialog(appFrame, noExistingFile.getMessage());
//			}
//			catch(IOException inputOutputError)
//			{
//				JOptionPane.showMessageDialog(appFrame, "There is no file there :(");
//				JOptionPane.showMessageDialog(appFrame, inputOutputError.getMessage());
//			}
//		}
//		else
//		{
//			try
//			{
//				outputWriter = new PrintWriter(fileName);
//				outputWriter.println(conversation);
//				outputWriter.close();
//			}
//			catch(FileNotFoundException noFileIsThere)
//			{
//				JOptionPane.showMessageDialog(appFrame, "There is no file there :(");
//			}
//		}
//	}
}
