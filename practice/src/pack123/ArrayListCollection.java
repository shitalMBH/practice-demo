package pack123;

import java.util.*;

//------------------ArrayListCollection---------------------------

public class ArrayListCollection {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("mangao");
		al.add(25);
		al.add('h');
		al.add(null);
		System.out.println(al);
		al.remove(2);
		al.add(2, 'p');
		System.out.println(al);
		List<String> fruits = new ArrayList<>();
		fruits.add("banana");
		System.out.println(fruits);
	}
}
