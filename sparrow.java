package ZooAnimals;

public class sparrow extends Bird implements Flyable{

	public sparrow(int age, String gender, int weightinlbs) {
		super(age, gender, weightinlbs);
	
	}
	public void fly() {
		System.out.println("Sparrows fly high........ ");
	}
	
	

}
