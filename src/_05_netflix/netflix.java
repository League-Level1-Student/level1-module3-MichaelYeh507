package _05_netflix;

public class netflix {
	public static void main(String[] args) {
		Movie Star_Wars = new Movie("Star Wars", 5);
		Movie Avengers = new Movie("Avengers", 5);
		Movie Jumanji = new Movie("Jumanji", 5);
		Movie Twilight = new Movie("Aladin", 4);
		Movie legoBatMan = new Movie("Lego Bathman Movie", 1);
		System.out.println(Star_Wars.getTicketPrice());
		NetflixQueue myQueue = new NetflixQueue();
		myQueue.addMovie(Star_Wars);
		myQueue.addMovie(Avengers);
		myQueue.addMovie(Jumanji);
		myQueue.addMovie(Twilight);
		myQueue.addMovie(legoBatMan);
		System.out.println(Star_Wars);
		System.out.println(Avengers);
		System.out.println(Jumanji);
		System.out.println(Twilight);
		System.out.println(legoBatMan);
		System.out.println("The best movie is " + myQueue.getBestMovie());
		System.out.println("The second best movie is " + "not twilight");
	}
}
