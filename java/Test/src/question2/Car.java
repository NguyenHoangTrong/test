package question2;

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
	public void run() {
		System.out.println(this.whell);
		System.out.println(this.doors);
		System.out.println(this.seats);
		System.out.println(maxSpeed);
		for(int i=0; i<10; i++) {
			System.out.println(maxSpeed);
		}
		
		
	}
	

}
