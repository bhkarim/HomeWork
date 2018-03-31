package ZooAnimals;

public class Zoo {

	public static void main(String[] args) {
		
	//	Animal anim1=new Animal(1,"f",4); Cannot instantiate Abstract class.
		Bird bird1=new Bird(2,"F",5);
		
		chicken chick1=new chicken(2,"F",8);
		chick1.eat();
		
		sparrow sparr1=new sparrow(2,"F",5);
		sparr1.fly();
		Flyable flyy= new sparrow(2,"F",5);
		flyy.fly();
		System.out.println("********************************");
		//sparr1.move();
		Fish fish1=new Fish(2,"M",15);
		fish1.move();
		System.out.println("---------------------------------");
		Animal sparr2= new sparrow(1,"F",5);
		sparr2.move();
		Animal fish2=new Fish(1,"F",15);
		fish2.move();
		System.out.println("**********************************");
		moveAnimals(fish2);
		moveAnimals(sparr2);
		
		
	}
	public static void moveAnimals(Animal anim) {
		anim.move();
	}

}
