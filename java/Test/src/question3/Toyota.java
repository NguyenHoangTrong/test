package question3;

public class Toyota extends Car{

	public Toyota(int whell, int doors, int seats, int maxSpeed) {
		super(whell, doors, seats, maxSpeed);
		// TODO Auto-generated constructor stub
	}

	//private int maxSpeed = 100;
	Car c = new Car(whell, doors, seats, maxSpeed);
	
	public void run() {
		c.run();
	}
	
}
