package com.revature.compare;

import java.util.ArrayList;
import java.util.Collections;

public class MovieListSorted {
	public static void main(String[] args) {
		ArrayList<Movie> arr=new ArrayList<>();
		
		arr.add(new Movie("Black Panther",8,2002));
		arr.add(new Movie("Captian America",4,2015));
		arr.add(new Movie("Thor",5,2010));
		
		Collections.sort(arr);
		for(Movie m:arr)
		{
			System.out.println(m);
		}
		
		
		System.out.println("\n-------After Comparator---------");
		MovieComprator m=new MovieComprator();
		Collections.sort(arr,m);
		for(Movie mo:arr)
		{
			System.out.println(mo);
		}
	}
}
