/*
 * Class: CMSC203 
 * Instructor:Ashique Tanveer
 * Description: User enters movie information once in this program. Once the user enters movie 
 * information it prints what the user entered in specific format and the program will end.
 * Due: 02/16/2023
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code 
 * from a student or any source. I have not given my code to any student.
   Print your Name here: Harlene Kaur

 */

import java.util.*;

//Task 1
public class MovieDriver_Task1 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Movie movie = new Movie();

		// Prompt the user to enter the name of the movie
		System.out.print("Enter the name of a movie: ");
		String title = myObj.nextLine();

		// Set the title of the movie entered by the user
		movie.setTitle(title);

		// Prompt the user to enter the rating of the movie
		System.out.print("Enter the rating of the movie: ");
		String rating = myObj.nextLine();

		// Set the rating of the movie entered by the user
		movie.setRating(rating);

		// Prompt the user to enter the number of tickets sold for the movie
		System.out.print("Enter the number of tickets sold for this movie: ");
		int SoldTickets = Integer.parseInt(myObj.nextLine());

		// Set the number of tickets sold for the movie entered by the user
		movie.setSoldTickets(SoldTickets);

		// Display the movie information using the toString() method
		System.out.println(movie);

		System.out.println("Goodbye");

		// Close the scanner object
		myObj.close();
	}

}
