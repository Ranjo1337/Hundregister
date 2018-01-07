import java.util.Scanner;
import java.util.ArrayList;


public class Kennel {
	private Scanner input = new Scanner(System.in);
	private ArrayList<Dog> listOfDogs = new ArrayList<>();

	public void startingMenu() {

		System.out.print("Ange kommando för vad du vill göra: \n " + "1: registrera hund.\n "
				+ "2: öka ålder på hund.\n " + "3: lista svanslängd.\n " + "4: radera hund. \n " + "5: avsluta.");
	}

	public void commandLoop() {

		boolean running = true;
		while (running) {

			startingMenu();
			
			String command = input.nextLine();
			switch (command) {
			case "1":
			case "register new dog":
				registerDog();
				break;
			case "2":
			case "increase age":
				increaseAge();
				break;
			case "3":
			case "list dogs":
				listTail();
				break;
			case "4":
			case "remove dog":
				deleteDog();
				break;
			case "5":
			case "exit":
				exitProgram();
				running = false;
				break;
			default:
				System.out.println("error");
				break;
			}
		}

	}

	public void registerDog() {
		System.out.print("namn: ");
		String name = input.nextLine();

		System.out.print("ras: ");
		String race = input.nextLine();

		System.out.print("ålder: ");
		int age = input.nextInt();
		input.nextLine();

		System.out.print("vikt: ");
		double weight = input.nextDouble();
		input.nextLine();

		Dog addedDog = new Dog(name, race, age, weight);
		listOfDogs.add(addedDog);
		System.out.println(name + " har lagts till!");

	}

	public void deleteDog() {
		boolean dogFound = false;
		System.out.println("Ange namnet på den hund som ska tas bort: ");
		String name = input.nextLine();
		for (int i = 0; i<listOfDogs.size(); i++) {
			 Dog d = listOfDogs.get(i);
			 if(name.equalsIgnoreCase(d.getName())) {
				 listOfDogs.remove(d);
				 System.out.println(name + " har tagits bort.");
				 dogFound = true;
			}
			
		}
		if(!dogFound) {
			 System.out.println("error, ingen hund med det namnet hittades.");
		 }
		
	}

	public void listTail() {
		System.out.println("Ange svanslängd:");
		double tail = input.nextDouble();
		input.nextLine();
		for (int i = 0; i<listOfDogs.size(); i++) {
			Dog d = listOfDogs.get(i);
			if(d.getTail() >= tail) {
				System.out.println(d);
			}
		}
		

	}

	public void increaseAge() {
		boolean dogFound = false;
		System.out.println("Ange namnet på den hund vars ålder skall ökas på: ");
		String name = input.nextLine();
		for(int i = 0; i < listOfDogs.size(); i++) {
			Dog d = listOfDogs.get(i); 
			if(name.equalsIgnoreCase(d.getName())) {
				d.birthday();
				System.out.println(name + " är nu 1 år äldre.");
				dogFound = true;
			} 
		}
		if(!dogFound) {
			System.out.println("error, ingen hund med det namnet hittades.");
		}
		
		
	}

	public void exitProgram() {
		System.out.println("Välkommen åter!");
//		System.exit(0);
		
	}

	public void run() {
		
		commandLoop();
	}

	public static void main(String[] args) {
		Kennel program = new Kennel();
		program.run();
	}
}
