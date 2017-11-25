package org.itner.domain;

public class SearchtableVO {
	
	private String cinemaTitle;
	private String movie;
	private String[] movietimes;
	
	public void setCinemaTitle(String cinemaTitle){
		this.cinemaTitle = cinemaTitle;
	}
	
	public void setMovie(String movie){
		this.movie = movie;
	}
	
	public void setMovieTimes(String[] movietimes){
		this.movietimes = movietimes;
	}
	
	public String getCinemaTitle(){
		return this.cinemaTitle;
	}
	
	public String getMovie(){
		return this.movie;
	}
	
	public String[] getMovietimes(){
		return this.movietimes;
	}
}
