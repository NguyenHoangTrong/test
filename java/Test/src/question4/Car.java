package question4;

public class Car implements Runnable{

	protected int whell;
	protected int doors;
	protected int seats;
	protected int maxSpeed;
	
	
	
	public Car(int whell, int doors, int seats, int maxSpeed) {
		this.whell = whell;
		this.doors = doors;
		this.seats = seats;
		this.maxSpeed = maxSpeed;
	}

	@Override
	synchronized public void run() {
			System.out.println(maxSpeed);
	}
}
