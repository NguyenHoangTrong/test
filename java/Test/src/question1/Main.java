package question1;

public class Main {
	public static void main(String[] args) {
		Toyota t = new Toyota(4, 4, 4, 100);
		BMV b = new BMV(4, 4, 4, 200);
		System.out.println("information for Toyota : ");
		t.info();
		System.out.println("===============================");
		System.out.println("Max speed for Toyota : ");
		t.run();
		System.out.println("===============================");
		System.out.println("information for BMV : ");
		b.info();
		System.out.println("===============================");
		System.out.println("Max speed for BMV : ");
		b.run();
	}
}
