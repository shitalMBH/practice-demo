//------------------ArraywithMethodandConstructor---------------------------
package pack123;

import java.util.*;

public class variables {
	int a, b;

	variables(int d, int e) {
		this.a = d;
		this.b = e;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

		variables c[] = new variables[2];
		c[0] = new variables(5, 15);
		c[1] = new variables(20, 52);

		for (int i = 0; i < c.length; i++) {

			c[i].display();

		}
	}

}
