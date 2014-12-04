package chatbot.model;

public class User
{
	/**
	 * declaration section
	 */
	private int userAge;
	private String userName;
	private String favoriteColor;
	
	/**
	 * These methods gather the info about the user.
	 */
	public User()
	{
		this.userName = "";
		this.userAge = 0;
		this.favoriteColor = "";
	}

	public int getUserAge()
	{
		return userAge;
	}

	public void setUserAge(int userAge)
	{
		this.userAge = userAge;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getFavoriteColor()
	{
		return favoriteColor;
	}

	public void setFavoriteColor(String favoriteColor)
	{
		this.favoriteColor = favoriteColor;
	}

}
