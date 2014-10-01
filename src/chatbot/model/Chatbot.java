package chatbot.model;

import java.util.ArrayList;

public class Chatbot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	
	
	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0.
	 * @param name The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		// this. means talk to the current class
	}

	public String getName()
	{
		return name;
	}
	/**
	 * returns the number of chats for this chatbot
	 * @return the current number of chats.
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}
	/**
	 * Sets chatbot's name.
	 * @param name the new name of chatbot
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * adds to the number of chats
	 */
	public void incrementChats()
	{
		numberOfChats++;
	}
	/**
	 * checks for input to close app.
	 * @param input
	 * @return
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input != null && input.equals("bye"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
	}

}
