import java.util.ArrayList;

public class Collection {
	public static void main (String args[]) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Ananth");
		al.add(3.5);
		al.add('A');
		al.add(null);
		System.out.println("ArrayList al contains; " + al.size());
		System.out.println("They are " + al);
	}
}
