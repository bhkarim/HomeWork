package ZooAnimals;

public abstract  class Animal {
	int age;
	String gender;
	int weightInlbs;
	public Animal(int age,String gender,int weightinlbs) {
		this.age=age;
		this.gender=gender;
		this.weightInlbs=weightInlbs;
	}
	public void eat() {
		System.out.println("eating.....");
	}
	public void sleep() {
		System.out.println("sleeping.....");
		
	}
	public abstract void move();


}
