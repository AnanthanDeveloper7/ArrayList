import java.util.ArrayList;

public class GenericType {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(18);
		al.add(15);
		al.add(100);
		for(Integer i : al) {
			System.out.println(i);
		}
	}

}
