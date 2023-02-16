/*
 * Class: CMSC203 
 * Instructor:Ashique Tanveer
 * Description: User can enter movie information multiple times in this program. Once the user enters movie 
 * information it prints what the user entered in specific format. 
 * Then the program will ask the user if they would like to enter another movie. 
 * If user enters "y" the program will restart, if "n" the program will end.
 * Due: 02/16/2023
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code 
 * from a student or any source. I have not given my code to any student.
   Print your Name here: Harlene Kaur
   
 */
//TASK 2
import java.util.*;

public class MovieDriver_Task2 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		while (true) {
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
			
			System.out.println("Do you want to enter another? (y or n)");
			String option = myObj.nextLine();
			
			if (option.equalsIgnoreCase("y")) {
				continue;
			}
			else {
				break;
			}
		}
		System.out.println("Goodbye");
		myObj.close();

	}
}