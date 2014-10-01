package chatbot.model;

import java.util.ArrayList;

public class Chatbot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	
	
	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0. Creates and fills the memeList.
	 * @param name The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		// this. means talk to the current class
		memeList = new ArrayList<String>();
		fillTheMemeList();
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
	 * fills the contents of the memeList.
	 */
	private void fillTheMemeList()
	{
		memeList.add("U mad bro?");
		memeList.add("WUD!");
		memeList.add("NO.");
		memeList.add("Ain't nobody got time for dat!");
		memeList.add("Y U DO THIS");
		memeList.add("This is why we can't have nice things.");
	}
	
	/**
	 * Processed the supplied text from the user to provide a message from the Chatbot.
	 * @param userText The user supplied text.
	 * @return What the Chatbot says because of the supplied input.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrementChats();
		
		if(memeChecker(userText))
		{
			processedText = "hey, you found a meme: " + userText;
			processedText += " isn't that cool.";
		}
		else
		{
			processedText = "Boring, that wasn't a meme";
		}
		return processedText;
	}
	
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;
		
		for(String currentMeme : memeList)
		{
			if(currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		
		return isAMeme;
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
