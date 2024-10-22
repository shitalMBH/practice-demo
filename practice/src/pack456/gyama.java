package pack456;

import pack123.alpha;
import pack123.beta;

public class gyama extends beta {
	public static void main(String[] args) {
		gyama p = new gyama();
		System.out.println(p.a);
//		System.out.println(p.b);
//		System.out.println(p.c);
		System.out.println(p.d);
		System.out.println("--------");

		alpha k = new alpha();
		System.out.println(k.a);
//		System.out.println(k.b);
//		System.out.println(k.c);
//		System.out.println(k.d);
		System.out.println("--------");

		beta h = new beta();
		System.out.println(h.a);
//		System.out.println(h.b);
//		System.out.println(h.c);
//		System.out.println(h.d);
		System.out.println("--------");

		h.velocity();
		speed();

	}
}
