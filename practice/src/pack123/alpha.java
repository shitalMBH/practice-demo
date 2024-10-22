package pack123;

public class alpha {
	public void velocity() {
		int x = 45;
		System.out.println(x);
	}
	public void velocity (int i) {
		System.out.println("This is int argument non static method");
	}

	public static void speed() {
		int y = 90;
		System.out.println(y);
	}


	public int a = 65;
	int b = 86;
	private int c = 45;
	protected int d = 77;

	public static void main(String[] args) {
		alpha g = new alpha();
		System.out.println(g.a);
		System.out.println(g.b);
		System.out.println(g.c);
		System.out.println(g.d);
		System.out.println("-----------");
		g.velocity();
		g.velocity(500);
		speed();
	}

}
