package chatbot.model;

import java.util.ArrayList;

import chatbot.view.ChatbotView;

public class Chatbot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	private ArrayList<String> userInputList;
	private String contentList;
	private User myUser;
	
	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0. Creates and fills the memeList. Sets the word for contentList.
	 * @param name The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		contentList = "";
		userInputList = new ArrayList<String>();
		memeList = new ArrayList<String>();
		fillTheMemeList();
		myUser = new User();
	}

	//returns the name of Chatbot.
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
		
		int randomChoice = (int) (Math.random() * 6);
		if(userText != null)
		{
			if(numberOfChats < 3)
			{
				if(numberOfChats == 0)
				{
					myUser.setUserName(userText);
					processedText = "Hello " + myUser.getUserName() + " what is your age?";
				}
				else if(numberOfChats == 1)
				{
					int age = Integer.parseInt(userText);
					myUser.setUserAge(age);
					processedText = "Hey " + myUser.getUserName() + ", you're really " + myUser.getUserAge() +" years old?";
					processedText += "\nWhat is your favorite color?";
				}
				else
				{
					myUser.setFavoriteColor(userText);
					processedText = "Your favorite color is " + myUser.getFavoriteColor() + ".";
					processedText += "\nTell me somthing else.";
				}

			}
			else
			{
			if (randomChoice == 0)
			{
				if(stringChecker(userText))
				{
					processedText = "woah! you write too long.";
					processedText += "That's right, I know how long you type Mr. " + userText;
				}
				else
				{
					processedText = "Try to type a little bit longer.";
				}
			}
			else if (randomChoice == 1)
			{
				if(contentChecker(userText))
				{
					processedText = "You like to talk about nothing?!...";
				}
				else
				{
					processedText = "Well, talking about something is better than nothing.";
				}
			}
			else if (randomChoice == 2)
			{
				if(memeChecker(userText))
				{
					processedText = "hey, you found a meme: " + userText;
					processedText += " isn't that cool.";
				}
				else
				{
					processedText = "Boring, that wasn't a meme";
				}
			}
			else if (randomChoice == 3)
			{
				//userInputList add
				userInputList.add(0, userText);
				processedText = "Thanks for the input, " + myUser.getUserName();
			}
			else if (randomChoice == 4)
			{
				if (userInputChecker(userText))
				{
					processedText = "Yikes you knew what you said before!!!";
				}
				else
				{
					processedText = "I don't think I have heard that before";
				}
			}
			else
			{
				if (chatbotNameChecker(userText))
				{
					processedText = chatbotNameConversation(userText);
				}
				else
				{
					processedText = noNameConversation(userText);
				}
			}
			}
		}
		else
		{
			numberOfChats--;
			processedText = "Please answer the question!";
		}
		incrementChats();
		return processedText;
	}
	
	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;
		
		if(userInputList.size() > 0)
		{
			for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
			{
				if(input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount--;
				}
			}
		}
		
		return matchesInput;
	}
	
	/**
	 * Checks your input for memes from a list
	 * @param currentText
	 * @return
	 */
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
	 * Checks your input's length.
	 * @param input
	 * @return
	 */
	private boolean stringChecker(String input)
	{
		boolean stringTooLong = false;
		
		if(input.length() >= 32)
		{
			stringTooLong = true;
		}
		
		return stringTooLong;
	}
	
	/**
	 * Checks your input for a specific word.
	 * @param input
	 * @return
	 */
	private boolean contentChecker(String input)
	{
		boolean hasContent = false;
		
		if(input.contains(contentList))
		{
			hasContent = true;
		}
		
		return hasContent;
	}
	
	/**
	 * Checks to see if the name of the chatbot is contained within the string supplied by the user.
	 * @param currentInput The user supplied string.
	 * @return whether the name is in there or not.
	 */
	private boolean chatbotNameChecker(String currentInput)
	{
		boolean hasNameInString = false;
		
		if(currentInput.indexOf(this.getName()) > -1)
		{
			hasNameInString = true;
		}
		
		return hasNameInString;
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

	private String chatbotNameConversation(String currentInput)
	{
		String nameConversation = "This is what you typed after my name: ";
		
		nameConversation += currentInput.substring(currentInput.indexOf(this.getName()) + this.getName().length() - 1);
		
		return nameConversation;
	}
	
	private String noNameConversation(String currentInput)
	{
		String notNamed = "";
		
		int smallRandom = (int) (Math.random() * currentInput.length() / 2);
		int largerRandom = (int) (smallRandom + (Math.random() * (currentInput.length() / 2)) + 1);
		
		notNamed = "You didn't say my name so here is a special phrase: " + currentInput.substring(smallRandom, largerRandom);
		
		return notNamed;
	}
	
	
}
