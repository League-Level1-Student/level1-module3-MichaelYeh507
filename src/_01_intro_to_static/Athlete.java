package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber;
    static String raceLocation = "San Diego";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
    	Athlete bob = new Athlete("Bob", 10);
    	System.out.println(bob.bibNumber);
    	System.out.println(bob.raceLocation);
    	System.out.println(bob.name);
    	Athlete joe = new Athlete("Joe", 20);
    	System.out.println(joe.bibNumber);
    	System.out.println(joe.name);
    	System.out.println(joe.raceLocation);
    	//print their names, bibNumbers, and the location of their race. 
    }
}
