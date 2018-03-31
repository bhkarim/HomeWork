package ZooAnimals;

public class Fish extends Animal {
	public Fish(int age, String gender, int weightinlbs) {
		super(age, gender, weightinlbs);	
	}
	public void swim() { 
		System.out.println("swimming.......");
	}
	public void move() {
		System.out.println("Fish swims......");
	}

}
