package question2;

public class BMV extends Car{

	public BMV(int whell, int doors, int seats, int maxSpeed) {
		super(whell, doors, seats, maxSpeed);
		// TODO Auto-generated constructor stub
	}
	
	//private int maxSpeed = 200;
	Car c = new Car(whell, doors, seats, maxSpeed);
		
	public void run() {
		c.run();
	}

}
