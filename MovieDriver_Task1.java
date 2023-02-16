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
		
		System.out.print("Enter the name of a movie: ");
		String title = myObj.nextLine();
		movie.setTitle(title);
		
		System.out.print("Enter the rating of the movie: ");
		String rating = myObj.nextLine();
		movie.setRating(rating);
		
		System.out.print("Enter the number of tickets sold for this movie: ");
		int SoldTickets = Integer.parseInt(myObj.nextLine());
		
		movie.setSoldTickets(SoldTickets);
		System.out.println(movie);
		
		System.out.println("Goodbye");
		
		myObj.close();
	}
}