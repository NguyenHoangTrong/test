package question3;

public class Main {

	public static void main(String[] args) {
		Toyota t = new Toyota(4, 4, 4, 100);
		BMV b = new BMV(4, 4, 4, 200);
		Thread threadToyota = new Thread(t, "Thread Toyota");
		threadToyota.setPriority(10);
		threadToyota.start();
		Thread threadBMV = new Thread(b, "Thread BMV");
		threadBMV.setPriority(5);
		threadBMV.start();
	}

}
