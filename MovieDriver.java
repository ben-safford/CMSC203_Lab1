import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		String flag = "y";
		Scanner s = new Scanner(System.in);
		while(!flag.equals("n")) {
			Movie mov = new Movie();
			System.out.print("Enter the title of a movie: ");
			mov.setTitle(s.nextLine());
			System.out.print("Enter the movie's rating: ");
			mov.setRating(s.nextLine());
			System.out.print("Enter the number of tickets sold: ");
			mov.setSoldTickets(s.nextInt());
			s.nextLine();
			System.out.println(mov.toString());
			
			System.out.print("Do you want to continue? y/n ");
			flag = s.nextLine();
		}
		System.out.println("Goodbye");
		s.close();
		
	}
	
	
}
