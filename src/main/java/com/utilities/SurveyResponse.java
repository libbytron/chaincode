package com.utilities;

public class SurveyResponse {
	
	private String name;
	private String favoriteLanguage;
	
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	
	public String getFavoriteLanguage() { return this.favoriteLanguage; }
	public void setFavoriteLanguage(String favoriteLanguage) { this.favoriteLanguage = favoriteLanguage; }
	
	public String toString() 
	{ 
		return "Name: " + name + "\n" +
			   "Favorite Language: " + favoriteLanguage + "\n" ;
	}
}
