package chatbot.model;

public class User
{
	private int userAge;
	private String userName;
	private String favoriteColor;
	
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
