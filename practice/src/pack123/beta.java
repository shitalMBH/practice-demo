package pack123;

public class beta extends alpha{
	public static void speed  () {
		System.out.println("This is zero argument static method");
	}
public static void main(String[] args) {
	beta h = new beta();
	System.out.println(h.a);
	System.out.println(h.b);
	//System.out.println(h.c);
	System.out.println(h.d);
	System.out.println("---------");
	alpha q =new alpha();
	h.velocity();
	q.velocity(100);
	speed();
	alpha.speed();



}
}
