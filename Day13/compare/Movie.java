package com.revature.compare;

public class Movie implements Comparable<Movie> {
	private String movieName;
	private int rating;
	private int year;

	public Movie() {
		super();
	}

	public Movie(String movieName, int rating, int year) {
		super();
		this.movieName = movieName;
		this.rating = rating;
		this.year = year;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	@Override
	public int compareTo(Movie o) {
		return this.year-o.year;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", rating=" + rating + ", year=" + year + "]";
	}

	
	
}
