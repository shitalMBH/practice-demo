package practice;

public class StringPractice {
	public static void main(String[] args) {
	String a = "I am a tester";
	String b = "Teaster";
	boolean c = b.equals("teaster");
	System.out.println(c);
	 c = b.equalsIgnoreCase("teaster");
	System.out.println(c);
	int size =a.length();
	System.out.println(size);
	a = a.toLowerCase();
	System.out.println(a);
	a = a.toUpperCase();
	System.out.println(a);
	String [] x = a.split("AM");
	for (String element : x) {System.out.println(element);}
	}

}
