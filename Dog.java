// namn: Oscar Gelin
// användarnamn: osge0455
public class Dog {
	
	private String name;
	private String race;
	private int age;
	private double weight;
	
	
	public Dog(String name, String race, int age, double weight) {
		this.name = name;
		this.race = race;
		this.age = age;
		this.weight = weight;
		
	
	}
	
	public String toString() {
		return name + " " + race + " " + age + " år " + weight + " kg svans = " + getTail();
	}
	
	public double getTail() {
		
		if (race.equalsIgnoreCase("tax") || race.equalsIgnoreCase("dachshund")){
			return 3.7;
		} else {
			return (age * weight) /10;
		}
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getRace() {
		return race;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	
	public void setAge(int age) {
		this.age = age;	
	}
	
	public void birthday() {
		age++;
		
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}

