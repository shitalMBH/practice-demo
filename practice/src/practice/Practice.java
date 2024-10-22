/*Program using mathematical operator
 * with method and scanner
 * with continuous console input still condition is cross*/
package practice;

import java.util.Scanner;

public class Practice {
	private double a, b, c, d, e, f;
	private Scanner sc;

	public Practice() {
		this.sc = new Scanner(System.in);

	}

	private void prerun() {
		System.out.println("Enter variable 1 =");
		a = sc.nextDouble();
		System.out.println("Enter variable 2 =");
		b = sc.nextDouble();
		c = a + b;
		d = a - b;
		e = a / b;
		f = a % b;
		System.out.println("Total = " + c);
		System.out.println("Subtraction = " + d);
		System.out.println("Divison = " + e);
		System.out.println("Remainder = " + f);
		System.out.println("-----------------------");
	}

	private void runloop() {
		c = a + b;
		while (true) {
			if (-100000 <= c && c <= 100000) {
				prerun();
			} else {
				System.out.println("\"Order is out of range.\nEnter amount within range\n-100000 <= value <= 100000\"");
				break;
			}

		}
	}

	public static void main(String[] args) {
		Practice g = new Practice();
		g.runloop();
		// g.sc.close();
	}

}
